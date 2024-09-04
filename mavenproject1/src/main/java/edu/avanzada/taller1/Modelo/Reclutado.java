/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

public class Reclutado extends Persona {
    private String codigoReclutamiento;

    public Reclutado(String cedula, String nombre, String apellido, String codigoReclutamiento) {
        super(cedula, nombre, apellido, "Reclutado");
        this.codigoReclutamiento = codigoReclutamiento;
    }

    // Métodos específicos de Reclutado...
}
