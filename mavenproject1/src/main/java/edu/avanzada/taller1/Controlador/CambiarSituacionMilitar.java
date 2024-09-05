/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;

/**
 * La clase CambiarSituacionMilitar encapsula la lógica para modificar
 * la situación militar de una persona.
 * 
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class CambiarSituacionMilitar {

    /**
     * Cambia la situación militar de una persona.
     * 
     * @param persona La persona cuya situación militar se va a cambiar.
     * @param nuevaSituacion La nueva situación militar a asignar.
     * @param detalle Información adicional sobre el cambio de situación.
     * @throws IllegalArgumentException Si el objeto persona es nulo.
     */
    public void cambiarSituacion(Persona persona, String nuevaSituacion, String detalle) {
        if (persona != null) {
            persona.setSituacionMilitar(nuevaSituacion);
            persona.setDetalle(detalle);
        } else {
            throw new IllegalArgumentException("Persona no puede ser nula.");
        }
    }
}