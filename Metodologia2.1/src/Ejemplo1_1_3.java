import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1_3{
    public static void main(String[] args) {
        try {
            processFile("test.in");
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se pudo procesar el archivo.");
        }
    }

    public static void processFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
