/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;


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
public class EstudianteDistanciaTest {
    private EstudianteDistancia instance;
    
    public EstudianteDistanciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EstudianteDistancia();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNumeroAsginaturas()  throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException{
        System.out.println("establecerNumeroAsginaturas");
        int numero = 10;
        instance.establecerNumeroAsginaturas(numero);
        Field field = instance.getClass().getDeclaredField("numeroAsignaturas");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
        
    }

    
    @Test
    public void testEstablecerCostoAsignatura()  throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerCostoAsignatura");
        double valor = 1.0;
        instance.establecerCostoAsignatura(valor);
        Field field = instance.getClass().getDeclaredField("costoAsignatura");
        field.setAccessible(true);
        assertEquals(field.get(instance), 1.0);
    }

    
    @Test
    public void testCalcularMatriculaDistancia() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("calcularMatriculaDistancia");
        instance.establecerCostoAsignatura(1.0);
        instance.establecerNumeroAsginaturas(10);
        instance.calcularMatriculaDistancia();
        Field field = instance.getClass().getDeclaredField("matriculaDistancia");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10.0);
    }

    
    @Test
    public void testObtenerNumeroAsignaturas() {
        System.out.println("obtenerNumeroAsignaturas");
        int expResult = 10;
        instance.establecerNumeroAsginaturas(10);
        int result = instance.obtenerNumeroAsignaturas();
        
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testObtenerCostoAsignatura() {
        System.out.println("obtenerCostoAsignatura");
        double expResult = 2.0;
        instance.establecerCostoAsignatura(2.0);
        double result = instance.obtenerCostoAsignatura();
        // https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of obtenerMatriculaDistancia method, of class EstudianteDistancia.
     */
    @Test
    public void testObtenerMatriculaDistancia() {
        System.out.println("obtenerMatriculaDistancia");
        instance.establecerCostoAsignatura(1.0);
        instance.establecerNumeroAsginaturas(10);
        instance.calcularMatriculaDistancia();
        double expResult = 10.0;
        double result = instance.obtenerMatriculaDistancia();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
