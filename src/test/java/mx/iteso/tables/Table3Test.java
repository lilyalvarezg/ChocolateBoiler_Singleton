package mx.iteso.tables;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table3;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertSame;

/**
 * Created by Lily on 29/10/2015.
 */
public class Table3Test {
    private TableOrder tableOrder;

    @Before
    public void setUp(){
        tableOrder= Table3.getInstance();
    }
    @Test
    public void InstanceTest(){
        TableOrder TO3= Table3.getInstance();       //Crear una "copia" de la instancia
        assertSame(tableOrder, TO3);     //Probar que son iguales las 2 instancias
    }
    @Test
    public void ClearTest(){
        Table3.clearOrder();
        TableOrder tableClear= Table3.getInstance();
        assertNotSame(tableOrder, tableClear);
    }
}
