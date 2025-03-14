package Practicas;

public class IteradorDiccionario<K, V> implements Iterador<ElementoDiccionario<K, V>> {
    private ElementoDoble<ElementoDiccionario<K, V>> actual;

    public IteradorDiccionario(ElementoDoble<ElementoDiccionario<K, V>> cabeza) {
        this.actual = cabeza;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public ElementoDiccionario<K, V> next() {
        if (!hasNext()) {
            throw new IllegalStateException("No hay más elementos");
        }
        ElementoDiccionario<K, V> dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Eliminación no soportada en este iterador");
    }
}