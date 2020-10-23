/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos;

import TiendaMusik.Canciones;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author yordan.castelblanco
 */
public class Adm_Busqueda_Canciones_DBNGTest {
    
    public Adm_Busqueda_Canciones_DBNGTest() {
    }
    
    /**
     * Test of BuscarNombre method, of class Adm_Busqueda_Canciones_DB.
     */
    @Test
    public void testBuscarNombre() {
        System.out.println("BuscarNombre");
        Object obj = new Canciones();
        Adm_Busqueda_Canciones_DB instance = new Adm_Busqueda_Canciones_DB();
        boolean expResult = false;
        boolean result = instance.BuscarNombre(obj);
        assertEquals(result, expResult);
    }

    /**
     * Test of BuscarArtista method, of class Adm_Busqueda_Canciones_DB.
     */
    @Test
    public void testBuscarArtista() {
        System.out.println("BuscarArtista");
        Object obj = new Canciones("", "Muse", "", "", "", 0);
        Adm_Busqueda_Canciones_DB instance = new Adm_Busqueda_Canciones_DB();
        boolean expResult = true;
        boolean result = instance.BuscarArtista(obj);
        assertEquals(result, expResult);
    }

    /**
     * Test of BuscarId method, of class Adm_Busqueda_Canciones_DB.
     */
    @Test
    public void testBuscarId() {
        System.out.println("BuscarId");
        Object obj = new Canciones("", "", "", "", "", 0);
        Adm_Busqueda_Canciones_DB instance = new Adm_Busqueda_Canciones_DB();
        boolean expResult = false;
        boolean result = instance.BuscarId(obj);
        assertEquals(result, expResult);
    }

    /**
     * Test of BuscarGenero method, of class Adm_Busqueda_Canciones_DB.
     */
    @Test
    public void testBuscarGenero() {
        System.out.println("BuscarGenero");
        Object obj = new Canciones("", "", "Rock", "", "", 0);
        Adm_Busqueda_Canciones_DB instance = new Adm_Busqueda_Canciones_DB();
        boolean expResult = true;
        boolean result = instance.BuscarGenero(obj);
        assertEquals(result, expResult);
    }
    
}
