package mx.iteso.tables;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

/**
 * Created by Lily on 29/10/2015.
 */
public class Table2Test {
    private TableOrder tableOrder;

    @Before
    public void setUp(){
        tableOrder= Table2.getInstance();
    }
    @Test
    public void InstanceTest(){
        TableOrder TO2= Table2.getInstance();       //Crear una "copia" de la instancia
        assertSame(tableOrder, TO2);     //Probar que son iguales las 2 instancias
    }
    @Test
    public void ClearTest(){
        Table2.clearOrder();
        TableOrder tableClear= Table2.getInstance();
        assertNotSame(tableOrder, tableClear);
    }
}
