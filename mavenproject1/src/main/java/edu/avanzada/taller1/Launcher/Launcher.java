/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package edu.avanzada.taller1.Launcher;

import edu.avanzada.taller1.Controlador.ControlVistaModelo;
import edu.avanzada.taller1.Controlador.GestorSituacionMilitar;
import edu.avanzada.taller1.Vista.VistaPrincipal;

/**
 * La clase Launcher es responsable de iniciar la aplicación de gestión de 
 * situación militar.
 * 
 * Esta clase se encarga de instanciar los componentes principales de la 
 * aplicación:
 * la vista principal, el gestor de situación militar y el controlador que 
 * los conecta.
 *
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class Launcher {
 
    /**
     * Método principal que inicia la aplicación.
     * 
     * Crea instancias de VistaPrincipal y GestorSituacionMilitar, 
     * y las conecta
     * mediante un ControlVistaModelo.
     *
     * @param args Argumentos de línea de comando (no se utilizan en esta 
     * aplicación).
     */
    public static void main(String[] args) {
        
        // Crear la vista principal
        VistaPrincipal vista = new VistaPrincipal();
        
        // Crear el gestor de situación militar
        GestorSituacionMilitar gestor = new GestorSituacionMilitar();
       
        // Conectar la vista y el gestor mediante el controlador
        new ControlVistaModelo(vista, gestor);
    }
}