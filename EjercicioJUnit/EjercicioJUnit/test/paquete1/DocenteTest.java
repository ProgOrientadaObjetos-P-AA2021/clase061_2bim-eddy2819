package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DocenteTest {
    private Docente instance;
    
    public DocenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Docente();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNombres() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerNombres");
        String nom = "rené";
        instance.establecerNombres(nom);
        Field field = instance.getClass().getDeclaredField("nombres");
        field.setAccessible(true);
        assertEquals(field.get(instance), "rené");
    }
    
    @Test
    public void testObtenerNombres() {
        System.out.println("obtenerNombres");
        String nom = "René";
        instance.establecerNombres(nom);
        assertEquals(instance.obtenerNombres(), "René");
    }

    
    @Test
    public void testEstablecerTipo() throws NoSuchFieldException, 
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerTipo");
        String n = "contratado";
        instance.establecerTipo(n);
        Field field = instance.getClass().getDeclaredField("tipo");
        field.setAccessible(true);
        assertEquals(field.get(instance), "contratado");
    }

    /**
     * Test of obtenerTipo method, of class Docente.
     */
    @Test
    public void testObtenerTipo() {
        System.out.println("obtenerTipo");
        String expResult = "contratado";
        instance.establecerTipo(expResult);
        String result = instance.obtenerTipo();
        assertEquals(expResult, result);
        
    }
    
}
