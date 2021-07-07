/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

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
public class ArriendoLocalComidaTest {
    ArriendoLocalComida instance;
    
    public ArriendoLocalComidaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ArriendoLocalComida("René", 20);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testEstablecerNombres() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerNombres");
        
        String nom = "René";
        instance.establecerNombreArrendatario(nom);
        Field field = instance.getClass().getSuperclass().getDeclaredField("nombreArrendatario");
        field.setAccessible(true);
        assertEquals(field.get(instance), "RENÉ");
    }
    
    
    
    @Test
    public void testEstablecerValorLuz() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerValorLuz");
        double x = 0.0;
        instance.establecerValorLuz(x);
        Field field = instance.getClass().getDeclaredField("valorLuz");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);
        
    }

    
    @Test
    public void testEstablecerValorAgua() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerValorAgua");
        double x = 0.0;
        instance.establecerValorLuz(x);
        Field field = instance.getClass().getDeclaredField("valorAgua");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);
        
    }

    
    @Test
    public void testEstablecerIva()  throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerIva");
        double x = 0.0;
        instance.establecerValorLuz(x);
        Field field = instance.getClass().getDeclaredField("iva");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);
        
    }

    
    @Test
    public void testEstablecerArriendoMensual() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerArriendoMensual");
        instance.establecerValorLuz(1);
        instance.establecerValorAgua(1);
        instance.establecerIva(0.1);
        instance.establecerArriendoMensual();
        Field field = instance.getClass().getSuperclass().getDeclaredField("arriendoMensual");
        field.setAccessible(true);
    }

    
    @Test
    public void testObtenerValorLuz() {
        System.out.println("obtenerValorLuz");
        double expResult = 0.0;
        instance.establecerValorLuz(0.0);
        double result = instance.obtenerValorLuz();
        assertEquals(expResult, result, 0.0);
        
    }

    
    @Test
    public void testObtenerValorAgua() {
        System.out.println("obtenerValorAgua");
        double expResult = 0.0;
        instance.establecerValorAgua(0.0);
        double result = instance.obtenerValorAgua();
        assertEquals(expResult, result, 0.0);
        
    }

    
    @Test
    public void testObtenerIva() {
        System.out.println("obtenerIva");
        double expResult = 0.0;
        instance.establecerIva(0.0);
        double result = instance.obtenerIva();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class ArriendoLocalComida.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        instance.establecerNombreArrendatario("René");
        instance.establecerCuotaBase(10);
        instance.establecerValorLuz(1);
        instance.establecerValorAgua(1);
        instance.establecerIva(0.1);
        instance.establecerArriendoMensual();
        
        String expResult = String.format("Ariendo de Local Comida\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor luz: %.2f\n"
                + "Valor agua: %.2f\n"
                + "Porcentaje iva: %.2f\n"
                + "Arriendo Total: %.2f\n", 
                "RENÉ",
                10.0,
                1.0,
                1.0,
                0.1,
                12.01);
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
