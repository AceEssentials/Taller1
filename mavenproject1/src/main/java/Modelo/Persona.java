/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIAN
 */

    public class Persona {
        private String nombre;
        private int cedula;
        private String apellido;

        public Persona(String nombre, int cedula, String apellido) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.apellido = apellido;
        }
            
        public String getNombre() {
            return nombre;
        }

        public int getCedula() {
            return cedula;
        }

        public String getApellido() {
            return apellido;
        }
        
        
    }
