package Practicas;

public class ListaDoblementeEnlazada<T> implements Lista<T> {
    private ElementoDoble<T> cabeza;
    private ElementoDoble<T> cola;
    private int numElementos;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        ElementoDoble<T> nuevoElemento = new ElementoDoble<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoElemento;
            cola = nuevoElemento;
        } else {
            cola.siguiente = nuevoElemento;
            nuevoElemento.anterior = cola;
            cola = nuevoElemento;
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
            if (cabeza != null) {
                cabeza.anterior = null;
            } else {
                cola = null;
            }
            numElementos--;
            return true;
        }

        ElementoDoble<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                }
                if (actual == cola) {
                    cola = actual.anterior;
                }
                numElementos--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaDoblementeEnlazada();
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    private class IteradorListaDoblementeEnlazada implements Iterador<T> {
        private ElementoDoble<T> actual;

        public IteradorListaDoblementeEnlazada() {
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