import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Ejercicio1 {
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona("John Doe", 30);
        Producto producto = new Producto("Laptop", 999.99);

        guardarObjetoEnArchivo("persona.json", persona);
        guardarObjetoEnArchivo("producto.json", producto);

        Persona personaCargada = cargarObjetoDesdeArchivo("persona.json", Persona.class);
        Producto productoCargado = cargarObjetoDesdeArchivo("producto.json", Producto.class);

        System.out.println("Persona cargada: " + personaCargada.nombre + ", " + personaCargada.edad);
        System.out.println("Producto cargado: " + productoCargado.nombre + ", " + productoCargado.precio);
    }
}

