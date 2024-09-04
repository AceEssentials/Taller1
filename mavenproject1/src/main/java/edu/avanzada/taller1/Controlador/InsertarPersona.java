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

public class InsertarPersona {
    private GestorSituacionMilitar gestor;

    public InsertarPersona(GestorSituacionMilitar gestor) {
        this.gestor = gestor;
    }

    public void ejecutar(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("Persona no puede ser null");
        }
        gestor.insertarPersona(persona);
    }
}
