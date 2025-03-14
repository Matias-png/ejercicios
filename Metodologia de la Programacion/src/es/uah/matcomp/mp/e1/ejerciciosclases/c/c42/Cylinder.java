package es.uah.matcomp.mp.e1.ejerciciosclases.c.c42;

public class Cylinder {
    private final Circle base;
    private double height = 1.0;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getArea() {
        double radius = base.getRadius();
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + base.toString() + " height=" + height;
    }
}
