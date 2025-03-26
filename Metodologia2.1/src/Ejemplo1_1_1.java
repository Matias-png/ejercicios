import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1_1{
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in")); // Intentar abrir el archivo
            // Lógica principal aquí
            System.out.println("Archivo procesado.");
        } catch (FileNotFoundException e) {
            // Manejo del error
            System.err.println("Error: No se pudo encontrar el archivo.");
            e.printStackTrace(); // Imprime el rastreo de la pila
        }
    }
}

