package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import java.util.ArrayList;


public class Matriz {

    public static void main(String[] args) {
        ArrayList<MyPoint> points = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            points.add(new MyPoint(i, i));
        }
        double[][] matriz = new double[10][10]; // Declaración de la matriz 10x10

        // Llenar la matriz con las distancias entre los puntos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = points.get(i).distance(points.get(j));
            }
        }

        // Imprimir la matriz en consola
        System.out.println("Matriz de distancias 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%6.2f", matriz[i][j]);
            }
            System.out.println();

        }
    }

}
