/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package problema01;

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
public class TrabajadorTest {
    
    public TrabajadorTest() {
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
     * Test of establecerCedula method, of class Trabajador.
     */
    @Test
    public void testEstablecerCedula() {
        System.out.println("establecerCedula");
        String n = "";
        Trabajador instance = new Trabajador();
        instance.establecerCedula(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerNombres method, of class Trabajador.
     */
    @Test
    public void testEstablecerNombres() {
        System.out.println("establecerNombres");
        String n = "";
        Trabajador instance = new Trabajador();
        instance.establecerNombres(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCorreo method, of class Trabajador.
     */
    @Test
    public void testEstablecerCorreo() {
        System.out.println("establecerCorreo");
        String n = "";
        Trabajador instance = new Trabajador();
        instance.establecerCorreo(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerSueldo method, of class Trabajador.
     */
    @Test
    public void testEstablecerSueldo() {
        System.out.println("establecerSueldo");
        double n = 0.0;
        Trabajador instance = new Trabajador();
        instance.establecerSueldo(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerMesSueldo method, of class Trabajador.
     */
    @Test
    public void testEstablecerMesSueldo() {
        System.out.println("establecerMesSueldo");
        double n = 0.0;
        Trabajador instance = new Trabajador();
        instance.establecerMesSueldo(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCedula method, of class Trabajador.
     */
    @Test
    public void testObtenerCedula() {
        System.out.println("obtenerCedula");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.obtenerCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombres method, of class Trabajador.
     */
    @Test
    public void testObtenerNombres() {
        System.out.println("obtenerNombres");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.obtenerNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCorreo method, of class Trabajador.
     */
    @Test
    public void testObtenerCorreo() {
        System.out.println("obtenerCorreo");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.obtenerCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerSueldo method, of class Trabajador.
     */
    @Test
    public void testObtenerSueldo() {
        System.out.println("obtenerSueldo");
        Trabajador instance = new Trabajador();
        double expResult = 0.0;
        double result = instance.obtenerSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMesSueldo method, of class Trabajador.
     */
    @Test
    public void testObtenerMesSueldo() {
        System.out.println("obtenerMesSueldo");
        Trabajador instance = new Trabajador();
        double expResult = 0.0;
        double result = instance.obtenerMesSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
