/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Launcher;
import edu.avanzada.taller1.Controlador.ControlVistaModelo;
import edu.avanzada.taller1.Controlador.GestorSituacionMilitar;
import edu.avanzada.taller1.Vista.VistaPrincipal;
/**
 *
 * @author JULIAN
 */
public class Launcher {
 
    public static void main(String[] args) {
        // Crear la vista y el modelo
        VistaPrincipal vista = new VistaPrincipal();
        GestorSituacionMilitar gestor = new GestorSituacionMilitar();

        // Crear el controlador y conectar todo
        new ControlVistaModelo(vista, gestor);
    }
}


