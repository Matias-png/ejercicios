package es.uah.matcomp.mp.e1.ejerciciosclases.d;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint( 5, 6, 2,2);
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