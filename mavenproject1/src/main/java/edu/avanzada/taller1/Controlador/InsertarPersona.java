/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
this template
 */
package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;

/**
 * La clase InsertarPersona encapsula la lógica para insertar una nueva persona
 * en el sistema de gestión de situaciones militares.
 *
 * Esta clase sigue el principio de responsabilidad única (SRP) del diseño 
 * SOLID,
 * enfocándose exclusivamente en la operación de inserción de una persona en el 
 * sistema.
 *
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class InsertarPersona {
    
    /** Gestor que maneja las operaciones relacionadas con la situación militar.
     */
    private GestorSituacionMilitar gestor;

    /**
     * Constructor de la clase InsertarPersona.
     *
     * @param gestor El gestor de situación militar a utilizar para las 
     * inserciones.
     */
    public InsertarPersona(GestorSituacionMilitar gestor) {
        this.gestor = gestor;
    }

    /**
     * Ejecuta la operación de inserción de una nueva persona en el sistema.
     *
     * @param persona La persona a insertar en el sistema.
     * @throws IllegalArgumentException Si el objeto persona es nulo.
     */
    public void ejecutar(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("Persona no puede ser null");
        }
        gestor.insertarPersona(persona);
    }
}