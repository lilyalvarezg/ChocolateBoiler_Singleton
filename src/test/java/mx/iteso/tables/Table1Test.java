package mx.iteso.tables;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertSame;

/**
 * Created by Lily on 29/10/2015.
 */
public class Table1Test {
    private TableOrder tableOrder;

    @Before
    public void setUp(){
        tableOrder= Table1.getInstance();
    }
    @Test
    public void InstanceTest(){
        TableOrder TO1= Table1.getInstance();       //Crear una "copia" de la instancia
        assertSame(tableOrder, TO1);     //Probar que son iguales las 2 instancias
    }
    @Test
    public void ClearTest(){
        Table1.clearOrder();
        TableOrder tableClear= Table1.getInstance();
        assertNotSame(tableOrder, tableClear);
    }
}
