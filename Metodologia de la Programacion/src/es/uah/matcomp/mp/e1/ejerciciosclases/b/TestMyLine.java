package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine r1 = new MyLine(1, 2, 3, 4); //Prueba constructor1
        System.out.println(r1); //Prueba toString

        MyPoint begin = new MyPoint(5, 6);
        MyPoint end = new MyPoint(7, 8);
        MyLine r2 = new MyLine(begin, end); //Prueba constructor 2
        System.out.println(r2);

        System.out.println("begin = " + r1.getBegin()); //Prueba getBegin
        r1.setBegin(begin); //Prueba setBegin
        System.out.println("begin = " + r1.getBegin());
        System.out.println("end = " + r1.getEnd()); //Prueba getEnd
        r1.setEnd(end);//Prueba setEnd
        System.out.println("end = " + r1.getEnd());

        System.out.println("X begin = " + r1.getBeginX());//Prueba getBeginX
        r1.setBeginX(1); //Prueba setBeginX
        System.out.println("X begin = " + r1.getBeginX());
        System.out.println("Y begin = " + r1.getBeginY()); //Prueba getBeginY
        r1.setBeginY(2);//Prueba setBeginY
        System.out.println("Y begin = " + r1.getBeginY());
        System.out.println("X end = " + r1.getEndX());//Prueba getEndX
        r1.setEndX(3);//Prueba setEndX
        System.out.println("X end = " + r1.getEndX());
        System.out.println("Y end = " + r1.getEndY());//Prueba getEndY
        r1.setEndY(4);//Prueba setEndY
        System.out.println("Y end = " + r1.getEndY());

        r1.setBeginXY(3, 4);//Prueba setBeginXY
        System.out.println("XY begin = " + Arrays.toString(r1.getBeginXY())); //Prueba getBeginXY
        r1.setEndXY(2, 5);//Prueba setEndXY
        System.out.println("XY end = " + Arrays.toString(r1.getEndXY()));//Prueba getEndXY

        System.out.println("Length = " + r1.getLength()); //Prueba getLenght
        System.out.println("Gradient = " + r1.getGradient()); //Prueba getGradient

    }

}
