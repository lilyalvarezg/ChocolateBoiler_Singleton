package mx.iteso;

import mx.iteso.singleton.ChocolateBoiler;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertSame;

/**
 * Created by Lily on 29/10/2015.
 */
public class ChocolateBoilerTest {
    public ChocolateBoiler choco_boiler;
    @Before
    public void setUp(){
        choco_boiler= ChocolateBoiler.getInstance();
    }
    @Test
    public void InstanceTest(){
        ChocolateBoiler boiler_instance= ChocolateBoiler.getInstance();
        assertSame(choco_boiler, boiler_instance);
    }
    @Test
    public void FillTest(){
       choco_boiler.fill();
        assertNotSame(true, choco_boiler.isEmpty());
    }
    @Test
    public void DrainTest(){
        choco_boiler.fill();
        choco_boiler.boil();
        choco_boiler.drain();
        assertEquals(true, choco_boiler.isEmpty());
    }
    @Test
    public void BoilTest(){
        choco_boiler.fill();
        choco_boiler.boil();
        assertEquals(true, choco_boiler.isBoiled());

    }
    @Test
    public void isEmptyTest(){
        choco_boiler.empty=true;
        assertEquals(true, choco_boiler.isEmpty());
    }
    @Test
    public void isBoiledTest(){
        choco_boiler.boiled=true;
        assertEquals(true, choco_boiler.isBoiled());
    }
   public class ThreadChoco implements Runnable{

       public void run() {
           choco_boiler= ChocolateBoiler.getInstance();
           if(choco_boiler.isEmpty())
               choco_boiler.fill();
           else
               if(!choco_boiler.isBoiled())
                   choco_boiler.boil();
           else
                   if(choco_boiler.isBoiled())
                       choco_boiler.drain();
       }
       @Test
       public void RunTest(){
           ThreadChoco t0= new ThreadChoco();
           ThreadChoco t1= new ThreadChoco();
           t0.run();
           t1.run();
           assertEquals(true, choco_boiler.isEmpty());

       }
   }
}
