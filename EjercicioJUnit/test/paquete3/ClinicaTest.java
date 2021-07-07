/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

/**
 *
 * @author reroes
 */
public class ClinicaTest {
    // Paso 1
    Clinica instance;
    
    public ClinicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Paso 2
        instance = new Clinica();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNumeroMedicos() throws IllegalArgumentException, 
            IllegalAccessException,
            NoSuchFieldException {
        // Paso 3
        System.out.println("establecerNumeroMedicos");
        int valor = 10;
        instance.establecerNumeroMedicos(valor);
        Field field = instance.getClass().getDeclaredField("numeroMedicos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
        
    }
    
    @Test
    public void testObtenerNombres() {
        // Paso 4
        
        System.out.println("obtenerNombres");
        int n = 100;
        instance.establecerNumeroMedicos(n);
        assertEquals(instance.obtenerNumeroMedicos(), 100);
    }
    
}
