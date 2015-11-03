package mx.iteso;

import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lily on 29/10/2015.
 */
public class DrinkTest {
    Drink drink;
    float price=10f;
    String description= "MEXICAN DRINK";
    @Before
    public void setUp(){
        drink= new Drink();
    }

    @Test
    public void testPrice(){
        drink.setPrice(price);
        assertEquals(price, drink.getPrice());
    }

    public void testDescription() {
        drink.setDescription(description);
        assertEquals(description, drink.getDescription());
    }
    public void testName(){
        drink.setName("Coke");
        assertEquals("Coke", drink.getName());
    }
    public void testWaiter(){
        drink.setWaiter("Waiter B");
        assertEquals("Waiter B", drink.getWaiter());
    }
}
