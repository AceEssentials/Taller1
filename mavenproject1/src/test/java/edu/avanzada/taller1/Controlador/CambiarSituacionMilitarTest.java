/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ganimedes
 */
public class CambiarSituacionMilitarTest {
    
    public CambiarSituacionMilitarTest() {
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
     * Test of cambiarSituacion method, of class CambiarSituacionMilitar.
     */
    @Test
    public void testCambiarSituacion() {
        System.out.println("cambiarSituacion");
        Persona persona = null;
        String nuevaSituacion = "";
        String detalle = "";
        CambiarSituacionMilitar instance = new CambiarSituacionMilitar();
        instance.cambiarSituacion(persona, nuevaSituacion, detalle);
    }
    
}
