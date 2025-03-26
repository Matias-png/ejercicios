import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Intentando abrir el archivo...");
            Scanner in = new Scanner(new File("test.in"));
            // Lógica principal
            System.out.println("Archivo abierto exitosamente.");
        } catch (FileNotFoundException ex) {
            // Bloque catch para manejar errores
            System.err.println("Archivo no encontrado.");
            ex.printStackTrace();
        } finally {
            // Bloque finally para limpieza
            System.out.println("Finalizando ejecución del bloque.");
        }
    }
}

