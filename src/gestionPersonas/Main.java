package gestionPersonas;

/**
 * Clase principal que sirve de ejemplo de uso de la clase {@link Persona}.
 * <p>
 * Crea una persona, muestra su información, modifica sus datos
 * y vuelve a mostrar la información actualizada.
 * </p>
 *
 * @author adrief
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Ana", 25);

        // Mostrar información de la persona
        persona.mostrarInformacion();

        // Cambiar el nombre y la edad
        persona.setNombre("Carlos");
        persona.setEdad(30);

        // Mostrar la nueva información de la persona
        persona.mostrarInformacion();
    }
}
