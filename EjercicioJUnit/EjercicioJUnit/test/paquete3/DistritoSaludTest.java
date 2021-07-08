/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.lang.reflect.Field;
import java.util.ArrayList;
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
public class DistritoSaludTest {

    DistritoSalud instance;

    public DistritoSaludTest() {
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
        instance = new DistritoSalud();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerListaClinicas() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        // TODO review the generated test code and remove the default call to fail.
        // Paso 3
        System.out.println("testEstablecerListaClinicas");
        ArrayList<Clinica> valor = new ArrayList<>();

        ArrayList<Clinica> valor2 = new ArrayList<>();

        instance.establecerListaClinicas(valor);
        Field field = instance.getClass().getDeclaredField("listaClinicas");
        field.setAccessible(true);

        assertArrayEquals(((ArrayList<Clinica>) field.get(instance)).toArray(),
                valor2.toArray());
    }

    @Test
    public void testObtenerListaClinicas() {
        // Paso 4

        System.out.println("testObtenerListaClinicas");
        ArrayList<Clinica> valor = new ArrayList<>();
        ArrayList<Clinica> valor2 = new ArrayList<>();

        instance.establecerListaClinicas(valor);
        assertArrayEquals(instance.obtenerListaClinicas().toArray(),
                valor2.toArray());
    }

    @Test
    public void testEstablecerTotalMedicos() throws IllegalArgumentException,
            IllegalAccessException,
            NoSuchFieldException {
        // Paso 3
        System.out.println("testEstablecerTotalMedicos");
        ArrayList<Clinica> valor = new ArrayList<>();
        Clinica c = new Clinica();
        c.establecerNumeroMedicos(5);
        Clinica c2 = new Clinica();
        c2.establecerNumeroMedicos(10);

        valor.add(c);
        valor.add(c2);

        instance.establecerListaClinicas(valor);

        instance.establecerTotalMedicos();

        Field field = instance.getClass().getDeclaredField("totalMedicos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 15);

    }

    @Test
    public void testObtenerTotalMedicos() {
        // Paso 4
        
        System.out.println("testObtenerTotalMedicos");

        ArrayList<Clinica> valor = new ArrayList<>();
        Clinica c = new Clinica();
        c.establecerNumeroMedicos(30);
        Clinica c2 = new Clinica();
        c2.establecerNumeroMedicos(20);

        valor.add(c);
        valor.add(c2);

        instance.establecerListaClinicas(valor);

        instance.establecerTotalMedicos();

        assertEquals(instance.obtenerTotalMedicos(), 50);
    }

}
