/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIAN
 */
public class Reservista extends Persona {
    private String libretaMiltiar;

    public Reservista(String libretaMiltiar, String nombre, int cedula, String apellido) {
        super(nombre, cedula, apellido);
        this.libretaMiltiar = libretaMiltiar;
    }
    
    
}
