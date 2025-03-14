package Practicas;

public class Cola<T> {
    private ListaSimplementeEnlazada<T> lista;

    public Cola() {
        lista = new ListaSimplementeEnlazada<>();
    }

    public void enqueue(T elemento) {
        lista.add(elemento);
    }

    public T dequeue() {
        if (lista.getNumElementos() == 0) {
            throw new IllegalStateException("La cola está vacía");
        }


        T elemento = lista.getIterador().next();
        lista.delete(elemento);
        return elemento;
    }

}