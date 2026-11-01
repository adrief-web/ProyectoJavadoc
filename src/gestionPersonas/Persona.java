package gestionPersonas;

/**
 * Representa a una persona con un nombre y una edad.
 * <p>
 * Esta clase permite crear personas, consultar y modificar sus datos
 * y mostrar su información por consola.
 * </p>
 *
 * @author adrief
 * @version 1.0
 */
public class Persona {

    /** Nombre de la persona. */
    private String nombre;

    /** Edad de la persona, expresada en años. */
    private int edad;

    /**
     * Crea una nueva persona con el nombre y la edad indicados.
     *
     * @param nombre nombre de la persona
     * @param edad   edad de la persona en años
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return la edad de la persona en años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad la nueva edad de la persona en años
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Muestra por consola el nombre y la edad de la persona
     * con el formato {@code Nombre: X, Edad: Y}.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
