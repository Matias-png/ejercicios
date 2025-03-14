package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(int radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizable Circle[" + super.toString() + "]";
    }

    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
