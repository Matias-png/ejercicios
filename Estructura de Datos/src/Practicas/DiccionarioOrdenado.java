package Practicas;

public class DiccionarioOrdenado<K extends Comparable<K>, V> {
    private ListaDoblementeEnlazada<ElementoDiccionario<K, V>> lista;

    public DiccionarioOrdenado() {
        lista = new ListaDoblementeEnlazada<>();
    }

    public void put(K clave, V valor) {
        ElementoDiccionario<K, V> nuevoElemento = new ElementoDiccionario<>(clave, valor);
        if (lista.getNumElementos() == 0) {
            lista.add(nuevoElemento);
            return;
        }

        Iterador<ElementoDiccionario<K, V>> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            ElementoDiccionario<K, V> elemento = iterador.next();
            if (elemento.getClave().compareTo(clave) > 0) {
                lista.addBefore(elemento, nuevoElemento);
                return;
            }
        }
        lista.add(nuevoElemento);
    }

    public V get(K clave) {
        Iterador<ElementoDiccionario<K, V>> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            ElementoDiccionario<K, V> elemento = iterador.next();
            if (elemento.getClave().equals(clave)) {
                return elemento.getValor();
            }
        }
        return null;
    }

    public boolean remove(K clave) {
        Iterador<ElementoDiccionario<K, V>> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            ElementoDiccionario<K, V> elemento = iterador.next();
            if (elemento.getClave().equals(clave)) {
                lista.delete(elemento);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return lista.getNumElementos();
    }

    private static class ElementoDiccionario<K, V> {
        private K clave;
        private V valor;

        public ElementoDiccionario(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }

        public K getClave() {
            return clave;
        }

        public V getValor() {
            return valor;
        }
    }
}