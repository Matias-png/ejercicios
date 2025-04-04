import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

class Asignatura {
    String nombreAsignatura;
    List<Estudiante> estudiantes;

    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Asignatura asignatura = new Asignatura("Matemáticas");
        asignatura.agregarEstudiante(new Estudiante("Carlos", 20));
        asignatura.agregarEstudiante(new Estudiante("Lucía", 22));

        String json = gson.toJson(asignatura);
        System.out.println(json);
    }
}

