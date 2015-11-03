package mx.iteso.tables;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table4;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

/**
 * Created by Lily on 29/10/2015.
 */
public class Table4Test {
    private TableOrder tableOrder;

    @Before
    public void setUp(){
        tableOrder= Table4.getInstance();
    }
    @Test
    public void InstanceTest(){
        TableOrder TO4= Table4.getInstance();       //Crear una "copia" de la instancia
        assertSame(tableOrder, TO4);     //Probar que son iguales las 2 instancias
    }
    @Test
    public void ClearTest(){
        Table4.clearOrder();
        TableOrder tableClear= Table4.getInstance();
        assertNotSame(tableOrder, tableClear);
    }
}
