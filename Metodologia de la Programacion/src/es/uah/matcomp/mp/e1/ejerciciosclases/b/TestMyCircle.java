package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(); //Prueba Cosntructor1
        System.out.println(c1);
        MyCircle c2 = new MyCircle(0, 0, 1); //Prueba Costructor2
        System.out.println(c2);
        MyPoint p1 = new MyPoint(1, 1);
        MyCircle c3 = new MyCircle(p1, 2); //Prueba Constructor 3
        System.out.println(c3);

        System.out.println("radius is: " + c1.getRadius()); //Prueba getRadius
        c1.setRadius(5);//Prueba setRadius
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("center is: " + c1.getCenter());//Prueba getCenter
        c1.setCenter(p1);//Prueba setCenter
        System.out.println("center is: " + c1.getCenter());
        System.out.println("X center is: " + c1.getCenterX());//Prueba getCenterX
        c1.setCenterX(0);//Prueba setCenterX
        System.out.println("X center is: " + c1.getCenterX());
        System.out.println("Y center is: " + c1.getCenterY());//Prueba getCenterY
        c1.setCenterY(0);//Prueba setCenterY
        System.out.println("Y center is: " + c1.getCenterY());
        System.out.println("XY center is: " + Arrays.toString(c1.getCenterXY())); //Prueba getCenterXY
        c1.setCenterXY(1, 1); //Prueba setCenterXY
        System.out.println("XY center is: " + Arrays.toString(c1.getCenterXY()));
        System.out.println("Area is: " + c1.getArea()); //Prueba getArea
        System.out.println("Circumference is: " + c1.getCircumference()); //Prueba getCircumference

        System.out.println("Distance is: " + c1.distance(c2)); //Prueba distance

    }

}


