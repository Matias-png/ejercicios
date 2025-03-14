package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;


public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);
        p1.setX(20);
        System.out.println(p1);
        p1.setY(10);
        System.out.println("X= " + p1.getX());
        System.out.println("Y= " + p1.getY());
        p1.setXY(10, 20);
        System.out.println(p1);
    }
}
