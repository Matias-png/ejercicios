package Excepciones1;

import java.util.Scanner;
import java.io.File;

//El programa no manejó la excepción declarada, resultando en un error de compilación.
public class ScannerFromFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(new File("test.in"));
// do something ...
    }
}