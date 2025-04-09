import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionAlumno {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java -jar NombreDeTuProyecto.jar <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String rutaArchivo = args[1];
        Gson gson = new Gson();

        switch (operacion) {
            case "init":
                Alumno alumno = new Alumno("Carlos", 21, "Informática");
                try (FileWriter writer = new FileWriter(rutaArchivo)) {
                    gson.toJson(alumno, writer);
                    System.out.println("Fichero creado con datos por defecto.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case "show":
                try (FileReader reader = new FileReader(rutaArchivo)) {
                    Alumno alumnoCargado = gson.fromJson(reader, Alumno.class);
                    System.out.println("Nombre: " + alumnoCargado.getNombre());
                    System.out.println("Edad: " + alumnoCargado.getEdad());
                    System.out.println("Carrera: " + alumnoCargado.getCarrera());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Operación no reconocida. Usa 'init' o 'show'.");
        }
    }
}

class Alumno {
    private String nombre;
    private int edad;
    private String carrera;

    public Alumno(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

