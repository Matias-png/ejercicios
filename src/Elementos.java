package src;

public class Elementos<T> {
    private T dato;
    private Elementos<T> siguiente;

    public Elementos(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Elementos<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Elementos<T> siguiente) {
        this.siguiente = siguiente;
    }
}


