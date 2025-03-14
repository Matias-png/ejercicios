package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle point1 = new MovableCircle( 5, 6, 2,2, 5);
        System.out.println(point1);
        point1.moveDown();
        System.out.println(point1);
        point1.moveUp();
        System.out.println(point1);
        point1.moveLeft();
        System.out.println(point1);
        point1.moveRight();
        System.out.println(point1);

    }}

