package Practicas;

public class DiccionarioBasico<K, V> {
    private ListaDoblementeEnlazada<ElementoDiccionario<K, V>> lista;


    public DiccionarioBasico() {
        lista = new ListaDoblementeEnlazada<>();
    }

    //añade elementos clave es la clave para acceder y valor el elemento añadido
    public void put(K clave, V valor) {
        ElementoDiccionario<K, V> nuevoElemento = new ElementoDiccionario<>(clave, valor);
        lista.add(nuevoElemento);
    }

   //devuelve el valor asociado a esa clave
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

    //elimina elementos de el diccionario mediante su clave devuelve true si fue eliminado con exito
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

    // devuelve el numero de elementos
    public int size() {
        return lista.getNumElementos();
    }

}