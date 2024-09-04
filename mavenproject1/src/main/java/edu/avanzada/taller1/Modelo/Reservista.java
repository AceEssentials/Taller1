/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**
 *
 * @author JULIAN
 */
public class Reservista extends Persona {
    private String libretaMilitar;

    public Reservista(String libretaMilitar, String nombre, String cedula, String apellido) {
        super(cedula, nombre, apellido, "Reservista");
        this.libretaMilitar = libretaMilitar;
    }

    // Getters y setters para libretaMilitar

    public String getLibretaMilitar() {
        return libretaMilitar;
    }

    public void setLibretaMilitar(String libretaMilitar) {
        this.libretaMilitar = libretaMilitar;
    }
}
