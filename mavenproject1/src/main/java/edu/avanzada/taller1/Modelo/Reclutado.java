/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**
 *
 * @author JULIAN
 */
public class Reclutado extends Persona{
    private String codigoDeReclutamiento;

    public Reclutado(String codigoDeReclutamiento, String nombre, String cedula, String apellido) {
        super(nombre, cedula, apellido, "Reclutado");
        this.codigoDeReclutamiento = codigoDeReclutamiento;
    }
    
}
