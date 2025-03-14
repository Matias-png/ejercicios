package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle cr1 = new ResizableCircle(50);
        System.out.println(cr1);
        cr1.resize(10);
        System.out.println(cr1);
    }

}
