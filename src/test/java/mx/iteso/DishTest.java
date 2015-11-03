package mx.iteso;


import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Lily on 29/10/2015.
 */
public class DishTest {
    Dish dish;
    float price=8f;
    String description= "MEXICAN DISH";
    @Before
    public void setUp(){
        dish= new Dish();
    }

    @Test
    public void testPrice(){
        dish.setPrice(price);
        assertEquals(price, dish.getPrice());
    }

    public void testDescription() {
        dish.setDescription(description);
        assertEquals(description, dish.getDescription());
    }
    public void testName(){
        dish.setName("Quesadilla Rajas");
        assertEquals("Quesadilla Rajas", dish.getName());
    }
    public void testWaiter(){
        dish.setWaiter("Waiter A");
        assertEquals("Waiter A", dish.getWaiter());
    }
}
