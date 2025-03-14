package es.uah.matcomp.mp.e1.ejerciciosclases.d.seispuntouno;

public class Rectangle extends Shape{
    protected double width=1.0f;
    protected double length=1.0f;
    protected double side=1.0f;
    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getSide(){
        return side;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*width+2*length;
    }
    @Override
    public String toString(){
        return "Rectangle[Shape[Color="+getColor()+",Filled="+isFilled()+"] Width="+width+",Length="+length+"]";
    }

}
