package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lily on 02/11/2015.
 */
public class TableOrderTest {
    public Dish dish;
    public Drink drink;
    public TableOrder TOrder;

    @Before
    public void setUp(){
        dish= new Dish();
        drink= new Drink();
        TOrder= Table2.getInstance();

    }

    @Test
    public void ClearDrinksTest(){
        TOrder.addDrink(drink);
        TOrder.clearDrinks();
        assertEquals(0, TOrder.drinks.size());      //Como se quitan los "drinks" debe de coincidir con que sea 0
    }
    @Test
    public void ClearDishTest(){
        TOrder.addDish(dish);
        TOrder.clearDishes();
        assertEquals(0, TOrder.dishes.size());
    }
    @Test
    public void addDrinkTest(){
        TOrder.addDrink(drink);
        assertEquals(1, TOrder.drinks.size());  //Como se agrega "una" bebida se compara con el tamaño
    }
    @Test
    public void addDishTest(){
        TOrder.addDish(dish);
        assertEquals(1, TOrder.dishes.size());  //Como se agrega "un" platillo se compara con el tamaño
    }
    @Test
    public void printCheckTest(){
        TOrder.printCheck();
    }

}
