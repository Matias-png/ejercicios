import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroJSON {
    public static void main(String[] args) {
        String rutaArchivo = "persona.json";
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(rutaArchivo)) {
            Persona persona = gson.fromJson(reader, Persona.class);
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (IOException e) {
            System.err.println("Error al leer el fichero JSON: " + e.getMessage());
        }
    }
}

class persona {
    private String nombre;
    private int edad;

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



