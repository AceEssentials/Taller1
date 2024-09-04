/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;

public class CambiarSituacionMilitar {

    public void cambiarSituacion(Persona persona, String nuevaSituacion, String detalle) {
        if (persona != null) {
            persona.setSituacionMilitar(nuevaSituacion);
            persona.setDetalle(detalle);
        } else {
            throw new IllegalArgumentException("Persona no puede ser nula.");
        }
    }
}
