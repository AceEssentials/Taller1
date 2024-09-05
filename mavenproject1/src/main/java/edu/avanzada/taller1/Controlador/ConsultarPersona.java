/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;

/**
 * La clase ConsultarPersona encapsula la lógica para consultar información de una persona
 * en el sistema basándose en su cédula.
 * 
 * Esta clase sigue el principio de responsabilidad única (SRP) del diseño SOLID,
 * enfocándose únicamente en la búsqueda y recuperación de información de una persona.
 *
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class ConsultarPersona {
    
    /** Gestor que maneja las operaciones relacionadas con la situación militar. */
    private GestorSituacionMilitar gestor;

    /**
     * Constructor de la clase ConsultarPersona.
     *
     * @param gestor El gestor de situación militar a utilizar para las consultas.
     */
    public ConsultarPersona(GestorSituacionMilitar gestor) {
        this.gestor = gestor;
    }

    /**
     * Ejecuta la consulta de una persona basada en su cédula.
     *
     * @param cedula La cédula de la persona a consultar.
     * @return La persona encontrada en el sistema.
     * @throws IllegalArgumentException Si la cédula es nula o vacía.
     */
    public Persona ejecutar(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Cédula no puede estar vacía");
        }
        return gestor.consultarPersona(cedula);
    }
}