/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Controlador;

/**
 *
 * @author JULIAN
 */


import edu.avanzada.taller1.Modelo.Persona;
import edu.avanzada.taller1.Modelo.Reservista;
import edu.avanzada.taller1.Vista.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlVistaModelo {
    private VistaPrincipal vista;
    private GestorSituacionMilitar gestor;

    public ControlVistaModelo (VistaPrincipal vista, GestorSituacionMilitar gestor) {
        this.vista = vista;
        this.gestor = gestor;

        this.vista.setInsertarListener(new InsertarListener());
        this.vista.setConsultarListener(new ConsultarListener());
        this.vista.setCambiarListener(new CambiarListener());
    }

    class InsertarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String cedula = vista.getCedula();
                String nombre = vista.getNombre();
                String apellido = vista.getApellido();
                String situacion = vista.getSituacionSeleccionada();
                
                Persona persona;

                if (situacion.equals("Reservista")) {
                    String libretaMilitar = vista.getLibretaMilitar();
                    persona = new Reservista(libretaMilitar, nombre, cedula, apellido);
                } else {
                    persona = new Persona(cedula, nombre, apellido, situacion);
                }

                gestor.insertarPersona(persona);
                vista.mostrarMensaje("Persona insertada con éxito.");
            } catch (Exception ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }

    class ConsultarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String cedula = vista.getCedula();
                Persona persona = gestor.consultarPersona(cedula);

                if (persona != null) {
                    vista.mostrarMensaje("Persona encontrada: " + persona.getNombre() + " " + persona.getApellido());
                } else {
                    vista.mostrarMensaje("Persona no encontrada.");
                }
            } catch (Exception ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }

    class CambiarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String cedula = vista.getCedula();
                String nuevaSituacion = vista.getSituacionSeleccionada();
                String detalle = vista.getLibretaMilitar(); // o algún otro detalle relevante

                gestor.cambiarSituacion(cedula, nuevaSituacion, detalle);
                vista.mostrarMensaje("Situación militar cambiada con éxito.");
            } catch (Exception ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}
