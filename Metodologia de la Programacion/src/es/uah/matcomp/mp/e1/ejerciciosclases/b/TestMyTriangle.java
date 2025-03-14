package es.uah.matcomp.mp.e1.ejerciciosclases.b;


public class TestMyTriangle {
    public static void main(String[] args) {

        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 3); //Prueba constructor1
        System.out.println(t1); //prueba toString
        MyPoint p1 = new MyPoint(3, 3);
        MyPoint p2 = new MyPoint(1, 0);
        MyPoint p3 = new MyPoint(5, 0);
        MyTriangle t2 = new MyTriangle(p1, p2, p3); //Prueba constructor2
        System.out.println(t2);
        MyTriangle t3 = new MyTriangle(0, 0, 1, 5, 4, 2);

        System.out.println("perimeter is " + t1.getPerimeter()); //Prueba calcular perimetro
        System.out.println("Triangle type is " + t1.getType()); //Prueba triangulo equilatero
        System.out.println("Triangle type is " + t2.getType());//Prueba triangulo isosceles
        System.out.println("Triangle type is " + t3.getType()); //Prueba triangulo escaleno


    }

}
