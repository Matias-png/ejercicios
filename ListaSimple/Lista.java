package ListaSimple;

public interface Lista<T> {
        boolean add(T elemento); // Añade un elemento a la lista
        boolean delete(T elemento); // Elimina un elemento de la lista
        Iterador<T> getIterador(); // Devuelve un iterador para recorrer la lista
        int getNumElementos(); // Devuelve el número de elementos en la lista
    }

