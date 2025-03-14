package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea() {
        return length * width;
    }
    public float getPerimeter() {
        return 2 * length + 2 * width;
    }
    public String toString (){

        return "Rectangulo[length=" + length + ", width=" + width + "]";
    }

}
