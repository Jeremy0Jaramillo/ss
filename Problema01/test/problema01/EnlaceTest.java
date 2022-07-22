/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package problema01;

import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA I
 */
public class EnlaceTest {
    
    public EnlaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerConexion method, of class Enlace.
     */
    @Test
    public void testEstablecerConexion() {
        System.out.println("establecerConexion");
        Enlace instance = new Enlace();
        instance.establecerConexion();
    }

    /**
     * Test of obtenerConexion method, of class Enlace.
     */
    @Test
    public void testObtenerConexion() {
        System.out.println("obtenerConexion");
        Enlace instance = new Enlace();
        Connection expResult = null;
        Connection result = instance.obtenerConexion();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertarTrabajador method, of class Enlace.
     */
    @Test
    public void testInsertarTrabajador() {
        System.out.println("insertarTrabajador");
        Trabajador trabajador = null;
        Enlace instance = new Enlace();
        instance.insertarTrabajador(trabajador);
    }

    /**
     * Test of obtenerDataTrabajadores method, of class Enlace.
     */
    @Test
    public void testObtenerDataTrabajadores() {
        System.out.println("obtenerDataTrabajadores");
        Enlace instance = new Enlace();
        ArrayList<Trabajador> expResult = null;
        ArrayList<Trabajador> result = instance.obtenerDataTrabajadores();
        assertEquals(expResult, result);
    }
    
}
