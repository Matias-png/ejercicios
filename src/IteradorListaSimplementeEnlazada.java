package src;

import java.util.NoSuchElementException;

public class IteradorListaSimplementeEnlazada<T> implements Iterador<T> {
    private Elementos<T> actual;

    public IteradorListaSimplementeEnlazada(Elementos<T> inicio) {
        this.actual = inicio;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T dato = actual.getDato();
        actual = actual.getSiguiente();
        return dato;
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Delete no implementado en el iterador.");
    }
}
