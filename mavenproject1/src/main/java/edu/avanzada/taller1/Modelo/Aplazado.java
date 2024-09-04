/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**
 *
 * @author JULIAN
 */
public class Aplazado extends Persona{
    private String fechaAplazamiento;

    public Aplazado(String fechaAplazamiento, String cedula, String nombre, String apellido, String situacionMilitar) {
        super(cedula, nombre, apellido, situacionMilitar);
        this.fechaAplazamiento = fechaAplazamiento;
    }

    public String getFechaAplazamiento() {
        return fechaAplazamiento;
    }

    public void setFechaAplazamiento(String fechaAplazamiento) {
        this.fechaAplazamiento = fechaAplazamiento;
    }

    
}
