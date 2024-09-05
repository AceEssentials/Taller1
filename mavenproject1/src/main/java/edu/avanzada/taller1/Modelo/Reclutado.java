/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**​

 * @author Julian Lopez

 * @version 1.1

 * 2/09/2024​

* la clase Aplazado está diseñada para manejar casos específicos de personas 
* cuya
* situación militar es "Reclutado", almacenando tanto la información general de 
* el reclutado y el codigo de reclutamiento

 *​

 */


public class Reclutado extends Persona {
    private String codigoReclutamiento;

    public Reclutado(String cedula, String nombre, String apellido, 
            String codigoReclutamiento) {
        super(cedula, nombre, apellido, "Reclutado");
        this.codigoReclutamiento = codigoReclutamiento;
    }

    // Métodos específicos de Reclutado...
}
