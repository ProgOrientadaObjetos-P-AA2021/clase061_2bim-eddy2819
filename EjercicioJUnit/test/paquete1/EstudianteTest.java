/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete1.Estudiante;
import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reroes
 */
public class EstudianteTest {
    private Estudiante instance;
    
    public EstudianteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Estudiante();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNombresEstudiante method, of class Estudiante.
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.NoSuchFieldException
     */
    @Test
    public void testEstablecerNombresEstudiante() throws IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException
             {
        System.out.println("establecerNombresEstudiante");
        String nom = "René";       
        instance.establecerNombresEstudiante(nom);
        Field field = instance.getClass().getDeclaredField("nombresEstudiante");
        assertEquals(field.get(instance), "rené");
    }

    
    @Test
    public void testEstablecerApellidoEstudiante() throws IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerApellidoEstudiante");
        String ape = "Elizalde";
        instance.establecerApellidoEstudiante(ape);
        Field field = instance.getClass().getDeclaredField("apellidosEstudiante");
        assertEquals(field.get(instance), "Elizalde");
    }

    
    @Test
    public void testEstablecerIdentificacionEstudiante() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerIdentificacionEstudiante");
        String iden = "110011";
        instance.establecerIdentificacionEstudiante(iden);
        Field field = instance.getClass().getDeclaredField("identificacionEstudiante");
        assertEquals(field.get(instance), "110011");
    }

    
    @Test
    public void testEstablecerEdadEstudiante() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerEdadEstudiante");
        int ed = 30;
        instance = new Estudiante();
        instance.establecerEdadEstudiante(ed);
        Field field = instance.getClass().getDeclaredField("edadEstudiante");
        assertEquals(field.get(instance), 30);
    }

    /**
     * Test of obtenerNombresEstudiante method, of class Estudiante.
     */
    @Test
    public void testObtenerNombresEstudiante() {
        System.out.println("obtenerNombresEstudiante");
        String expResult = "rené";
        instance.establecerNombresEstudiante("René");
        String result = instance.obtenerNombresEstudiante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obtenerApellidoEstudiante method, of class Estudiante.
     */
    @Test
    public void testObtenerApellidoEstudiante() {
        System.out.println("obtenerApellidoEstudiante");
        String expResult = "Elizalde";
        instance.establecerApellidoEstudiante("Elizalde");
        String result = instance.obtenerApellidoEstudiante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obtenerIdentificacionEstudiante method, of class Estudiante.
     */
    @Test
    public void testObtenerIdentificacionEstudiante() {
        System.out.println("obtenerIdentificacionEstudiante");
        String expResult = "11002211";
        instance.establecerIdentificacionEstudiante("11002211");
        String result = instance.obtenerIdentificacionEstudiante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obtenerEdadEstudiante method, of class Estudiante.
     */
    @Test
    public void testObtenerEdadEstudiante() {
        System.out.println("obtenerEdadEstudiante");
        int expResult = 30;
        instance.establecerEdadEstudiante(30);
        int result = instance.obtenerEdadEstudiante();
        assertEquals(expResult, result);
        
    }
    
}
