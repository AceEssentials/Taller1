/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**​

 * @author Julian Lopez

 * @version 1.1

 * 2/09/2024​

la clase Persona está diseñada para manejar 
* los atributos base de la clase padre Persona.

 *​

 */

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String situacionMilitar;
    private String detalle;

    public Persona(String cedula, String nombre, String apellido, 
            String situacionMilitar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.situacionMilitar = situacionMilitar;
    }

    // Getters y setters
    
    public String getSituacion() {
    return situacionMilitar; 
}


    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSituacionMilitar() {
        return situacionMilitar;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setSituacionMilitar(String situacionMilitar) {
        this.situacionMilitar = situacionMilitar;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

