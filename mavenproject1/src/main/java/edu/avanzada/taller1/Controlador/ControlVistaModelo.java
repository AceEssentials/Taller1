package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;
import edu.avanzada.taller1.Modelo.Reservista;
import edu.avanzada.taller1.Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * La clase ControlVistaModelo actúa como puente entre la interfaz gráfica 
 * (VistaPrincipal)
 * y la lógica de negocio (GestorSituacionMilitar).
 * 
 * Esta clase implementa el patrón MVC (Modelo-Vista-Controlador), gestionando 
 * las acciones
 * del usuario como insertar, consultar y cambiar la situación militar de personas.
 *
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class ControlVistaModelo {
    private VistaPrincipal vista;
    private GestorSituacionMilitar gestor;

    /**
     * Constructor de la clase ControlVistaModelo.
     *
     * @param vista La instancia de VistaPrincipal que representa la interfaz 
     * gráfica.
     * @param gestor La instancia de GestorSituacionMilitar que maneja la lógica
     * de negocio.
     */
    public ControlVistaModelo(VistaPrincipal vista, GestorSituacionMilitar gestor) {
        this.vista = vista;
        this.gestor = gestor;
        this.vista.setInsertarButtonListener(new InsertarListener());
        this.vista.setConsultarButtonListener(new ConsultarListener());
        this.vista.setCambiarButtonListener(new CambiarListener());
    }

    /**
     * Clase interna que maneja el evento de inserción de una persona.
     */
    class InsertarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String cedula = vista.getCedulaText();
                String nombre = vista.getNombreText();
                String apellido = vista.getApellidoText();
                String situacion = vista.getSituacionSeleccionada();
                Persona persona;

                if (situacion.equals("Reservista")) {
                    String libretaMilitar = vista.getLibretaMilitarText();
                    persona = new Reservista(libretaMilitar, nombre, cedula, 
                            apellido);
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

    /**
     * Clase interna que maneja el evento de consulta de personas.
     */
    class ConsultarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                List<Persona> listaPersonas = gestor.obtenerTodasLasPersonas();
                if (listaPersonas.isEmpty()) {
                    vista.mostrarMensaje("No hay personas registradas.");
                } else {
                    StringBuilder mensaje = new StringBuilder("Personas "
                            + "registradas:\n");
                    for (Persona persona : listaPersonas) {
                        mensaje.append("Cédula: ").append(persona.getCedula())
                               .append(", Nombre: ").append(persona.getNombre())
                               .append(" ").append(persona.getApellido())
                               .append(", Situación: ").append(persona.
                                       getSituacion())
                               .append("\n");
                    }
                    vista.mostrarMensaje(mensaje.toString());
                }
            } catch (Exception ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }

    /**
     * Clase interna que maneja el evento de cambio de situación militar.
     */
    class CambiarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String cedula = vista.getCedulaText();
                String nuevaSituacion = vista.getSituacionSeleccionada();
                String detalle = vista.getLibretaMilitarText();
                gestor.cambiarSituacion(cedula, nuevaSituacion, detalle);
                vista.mostrarMensaje("Situación militar cambiada con éxito.");
            } catch (Exception ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}