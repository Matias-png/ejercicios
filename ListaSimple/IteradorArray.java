package ListaSimple;// IteradorArray.java
import java.util.NoSuchElementException;

public class IteradorArray<T> implements Iterador<T> {
    private T[] elementos; // Array de elementos
    private int indice; // Índice actual del iterador

    // Constructor
    public IteradorArray(T[] elementos) {
        this.elementos = elementos;
        this.indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < elementos.length && elementos[indice] != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en la lista.");
        }
        return elementos[indice++]; // Devuelve el elemento actual y avanza el índice
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Eliminación no soportada en este iterador.");
    }
}