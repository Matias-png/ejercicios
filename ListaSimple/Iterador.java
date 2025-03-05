package ListaSimple;

public interface Iterador<T> {
    boolean hasNext(); // Verifica si hay un siguiente elemento
    T next(); // Devuelve el siguiente elemento
    void delete(); // Elimina el último elemento devuelto por next()
}