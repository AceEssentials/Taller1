package edu.avanzada.taller1.Controlador;

import edu.avanzada.taller1.Modelo.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La clase GestorSituacionMilitar es el núcleo de la lógica de negocio para 
 * la gestión
 * de la situación militar de las personas.
 * 
 * Esta clase es responsable de las siguientes operaciones clave:
 * - Inserción de nuevas personas en el sistema
 * - Consulta de personas por su cédula
 * - Cambio de la situación militar de una persona
 * - Obtención de todas las personas registradas
 *
 * @author Julian Lopez
 * @version 1.1
 * @since 2/09/2024
 */
public class GestorSituacionMilitar {

    /** Almacena las personas registradas, indexadas por su cédula. */
    private final Map<String, Persona> personas;

    /** Instancia para manejar los cambios de situación militar. */
    private final CambiarSituacionMilitar cambiarSituacionMilitar;

    /**
     * Constructor de la clase GestorSituacionMilitar.
     * Inicializa la estructura de datos para almacenar personas y el objeto 
     * para cambiar situaciones.
     */
    public GestorSituacionMilitar() {
        personas = new HashMap<>();
        cambiarSituacionMilitar = new CambiarSituacionMilitar();
    }

    /**
     * Inserta una nueva persona en el sistema.
     *
     * @param persona La persona a insertar.
     * @throws IllegalArgumentException Si la persona ya existe en el sistema.
     */
    public void insertarPersona(Persona persona) {
        if (!personas.containsKey(persona.getCedula())) {
            personas.put(persona.getCedula(), persona);
        } else {
            throw new IllegalArgumentException("La persona ya existe.");
        }
    }

    /**
     * Consulta una persona por su cédula.
     *
     * @param cedula La cédula de la persona a consultar.
     * @return La persona encontrada o null si no existe.
     */
    public Persona consultarPersona(String cedula) {
        return personas.get(cedula);
    }

    /**
     * Cambia la situación militar de una persona.
     *
     * @param cedula La cédula de la persona cuya situación se va a cambiar.
     * @param nuevaSituacion La nueva situación militar.
     * @param detalle Detalles adicionales sobre el cambio de situación.
     * @throws IllegalArgumentException Si la persona no se encuentra en el
     * sistema.
     */
    public void cambiarSituacion(String cedula, String nuevaSituacion, String 
            detalle) {
        Persona persona = consultarPersona(cedula);
        if (persona != null) {
             persona.setSituacionMilitar(nuevaSituacion);
        } else {
            throw new IllegalArgumentException("Persona no encontrada.");
        }
    }

    /**
     * Obtiene una lista de todas las personas registradas en el sistema.
     *
     * @return Una lista con todas las personas registradas.
     */
    public List<Persona> obtenerTodasLasPersonas() {
        return new ArrayList<>(personas.values());
    }
}