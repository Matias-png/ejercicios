package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;


public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Begin is=" + l1.getBegin());
        System.out.println("End is=" + l1.getEnd());
        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l1);
        System.out.println("BeginX is=" + l1.getBeginX());
        System.out.println("EndX is=" + l1.getEndX());
        System.out.println("BeginY is=" + l1.getBeginY());
        System.out.println("EndY is=" + l1.getEndY());
        l1.setBeginX(10);
        l1.setBeginY(20);
        System.out.println(l1);
        l1.setBeginXY(20, 10);
        System.out.println(l1);
        l1.setEndX(30);
        l1.setEndY(40);
        System.out.println(l1);
        l1.setEndXY(40, 30);
        System.out.println(l1);
        System.out.println("Length is=" + l1.getLength());
        System.out.println("Gradient is=" + l1.getGradient());

    }
}