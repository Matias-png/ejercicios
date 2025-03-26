package Excepciones1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/*
Decides no manejar la excepción en el método actual, pero lanzar la excepción hacia arriba en la pila de llamadas para
0que el método de nivel superior la maneje
 */
public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
// to be handled by next higher-level method
        Scanner in = new Scanner(new File("test.in"));
// this method may throw FileNotFoundException
// main logic here ...
    }
}