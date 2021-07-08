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
 * @author DELL
 */
public class ArriendoLocalSesionesTest {

    ArriendoLocalSesiones instance;

    public ArriendoLocalSesionesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new ArriendoLocalSesiones("de salud", 100);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerValorSillas method, of class ArriendoLocalSesiones.
     */
    @Test
    public void testEstablecerValorSillas() throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
        System.out.println("establecerValorSillas");
        double x = 0.0;
        instance.establecerValorSillas(x);
        Field field = instance.getClass().getDeclaredField("valorSillas");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);

    }

    @Test
    public void testEstablecerValorAmplificacion() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("establecerValorAmplificacion");
        double x = 0.0;
        instance.establecerValorAmplificacion(x);
        Field field = instance.getClass().getDeclaredField("valorAmplificacion");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);

    }

    @Test
    public void testEstablecerArriendoMensual() throws NoSuchFieldException {
        System.out.println("establecerArriendoMensual");
        instance.establecerValorAmplificacion(1);
        instance.establecerValorSillas(2);
        instance.establecerArriendoMensual();
        Field field = instance.getClass().getSuperclass().getDeclaredField("arriendoMensual");
        field.setAccessible(true);

    }

    @Test
    public void testObtenerValorSillas() {
        System.out.println("obtenerValorSillas");
        double expResult = 0.0;
        instance.establecerValorSillas(0.0);
        double result = instance.obtenerValorSillas();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testObtenerValorAmplificacion() {
        System.out.println("obtenerValorAmplificacion");
        double expResult = 0.0;
        instance.establecerValorAmplificacion(0.0);
        double result = instance.obtenerValorAmplificacion();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of toString method, of class ArriendoLocalSesiones.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        instance.establecerNombreArrendatario("Eddy");
        instance.establecerCuotaBase(20);
        instance.establecerValorSillas(2.0);
        instance.establecerValorAmplificacion(1.0);
        instance.establecerArriendoMensual();
        String expResult = String.format("Ariendo de Local Sesiones\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n",
                "Eddy",
                20.0,
                2.0,
                1.0,
                23.0);
        String result = instance.toString();
        assertEquals(expResult, result);

    }

}
