package es.uah.matcomp.mp.e1.ejerciciosclases.d.seispuntouno;

public class Square extends Rectangle {
    protected double side=1.0f;
    public Square() {
    }
    public Square(double side) {
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        this.side=side;
    }
    @Override
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Square[Rectangle[Shape[Color=" + getColor() + ",Filled=" + isFilled() + "] Width=" + getWidth()+",Length="+getLength()+"]";
    }
}
