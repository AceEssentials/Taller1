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
import java.util.HashMap;
import java.util.Map;

public class GestorSituacionMilitar {
    private final Map<String, Persona> personas;
    private final CambiarSituacionMilitar cambiarSituacionMilitar;

    public GestorSituacionMilitar() {
        personas = new HashMap<>();
        cambiarSituacionMilitar = new CambiarSituacionMilitar();
    }

    public void insertarPersona(Persona persona) {
        if (!personas.containsKey(persona.getCedula())) {
            personas.put(persona.getCedula(), persona);
        } else {
            throw new IllegalArgumentException("La persona ya existe.");
        }
    }

    public Persona consultarPersona(String cedula) {
        return personas.get(cedula);
    }

    public void cambiarSituacion(String cedula, String nuevaSituacion, String detalle) {
        Persona persona = consultarPersona(cedula);
        if (persona != null) {
            cambiarSituacionMilitar.cambiarSituacion(persona, nuevaSituacion, detalle);
        } else {
            throw new IllegalArgumentException("Persona no encontrada.");
        }
    }
}

