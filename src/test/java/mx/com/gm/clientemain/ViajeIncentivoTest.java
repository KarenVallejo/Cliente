/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.com.gm.clientemain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author KAREN
 */
public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeIncentivo instance = null;
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
