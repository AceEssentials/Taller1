/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Controlador;

/**
 *
 * @author JULIAN
 */


import edu.avanzada.taller1.Modelo.Persona;

public class ConsultarPersona {
    private GestorSituacionMilitar gestor;

    public ConsultarPersona(GestorSituacionMilitar gestor) {
        this.gestor = gestor;
    }

    public Persona ejecutar(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Cédula no puede estar vacía");
        }
        return gestor.consultarPersona(cedula);
    }
}
