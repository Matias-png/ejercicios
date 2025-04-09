import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class CrearJSON {
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona = new Persona("Antonio Moratilla", 97);

        // Crear una instancia de Gson para convertir el objeto en JSON
        Gson gson = new Gson();
        String json = gson.toJson(persona);

        // Guardar el JSON en un fichero
        try (FileWriter writer = new FileWriter("persona.json")) {
            writer.write(json);
            System.out.println("JSON creado y guardado en 'persona.json'");
        } catch (IOException e) {
            System.err.println("Error al guardar el JSON: " + e.getMessage());
        }
    }
}

// Clase Persona con atributos y métodos getter y setter
class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

