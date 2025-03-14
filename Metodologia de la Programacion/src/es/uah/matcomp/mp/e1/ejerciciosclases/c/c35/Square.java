package es.uah.matcomp.mp.e1.ejerciciosclases.c.c35;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Square[" + super.toString() + "]";
    }
}
