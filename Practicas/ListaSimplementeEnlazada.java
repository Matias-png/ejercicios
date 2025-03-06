package Practicas;


public class ListaSimplementeEnlazada<T> implements Lista<T> {
    private Elemento<T> cabeza;
    private int numElementos = 0;

    public ListaSimplementeEnlazada() {
        this.cabeza = null;
        this.numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoElemento;
        } else {
            Elemento<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoElemento;
        }
        numElementos++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.dato.equals(elemento)) {
            cabeza = cabeza.siguiente;
            numElementos--;
            return true;
        }

        Elemento<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(elemento)) {
                actual.siguiente = actual.siguiente.siguiente;
                numElementos--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaSimplementeEnlazada();
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    private class IteradorListaSimplementeEnlazada implements Iterador<T> {
        private Elemento<T> actual;

        public IteradorListaSimplementeEnlazada() {
            actual = cabeza;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No hay más elementos");
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }

        @Override
        public void delete() {
            throw new UnsupportedOperationException("Eliminación no soportada en este iterador");
        }
    }
}