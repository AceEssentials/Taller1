/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIAN
 */
public class Reclutado extends Persona{
    private String codigoReclutamiento;

    public Reclutado(String codigoDeReclutamiento, String nombre, int cedula, String apellido) {
        super(nombre, cedula, apellido);
        this.codigoReclutamiento = codigoDeReclutamiento;
    }
    
}
