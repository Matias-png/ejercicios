package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class TestMyPoint {
    public static void main(String[] args) {
        //Example distance(x,y)
        MyPoint p3 = new MyPoint(3, 4);
        MyPoint p4 = new MyPoint(5, 6);
        System.out.println(p3.distance(5, 6));
        //Example distance(another)
        System.out.println(p3.distance(p4));
        //Example distance()
        System.out.println(p3.distance());


        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // distance(another)
        System.out.println(p2.distance(p1)); // distance(another)
        System.out.println(p1.distance(5, 6)); // distance(x,y)
        System.out.println(p1.distance()); // distance()


    }

}
