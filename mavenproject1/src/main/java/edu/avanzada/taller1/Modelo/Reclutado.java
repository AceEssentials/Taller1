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
    private String codigoReclutamiento;

<<<<<<< HEAD:mavenproject1/src/main/java/edu/avanzada/taller1/Modelo/Reclutado.java
    public Reclutado(String codigoDeReclutamiento, String nombre, String cedula, String apellido) {
        super(nombre, cedula, apellido, "Reclutado");
        this.codigoDeReclutamiento = codigoDeReclutamiento;
=======
    public Reclutado(String codigoDeReclutamiento, String nombre, int cedula, String apellido) {
        super(nombre, cedula, apellido);
        this.codigoReclutamiento = codigoDeReclutamiento;
>>>>>>> 63913295d43d0fd4c8505fd7c71abb08d2a12453:mavenproject1/src/main/java/Modelo/Reclutado.java
    }
    
}
