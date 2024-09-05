/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Modelo;

/**​

 * @author Julian Lopez

 * @version 1.1

 * 2/09/2024​

la clase Aplazado está diseñada para manejar casos específicos de personas cuya
* situación militar es "Aplazado", almacenando tanto la información general de 
* la persona como la fecha en que se produjo el aplazamiento.

 *​

 */

public class Aplazado extends Persona{
    private String fechaAplazamiento;

    public Aplazado(String fechaAplazamiento, String nombre, String cedula, 
            String apellido) {
        super(nombre, cedula, apellido, "Aplazado");
        this.fechaAplazamiento = fechaAplazamiento;
    }
    
}
