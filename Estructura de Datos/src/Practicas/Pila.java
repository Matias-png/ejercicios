package Practicas;

public class Pila<T> {
    private ListaSimplementeEnlazada<T> lista;

    public Pila() {
        lista = new ListaSimplementeEnlazada<>();
    }

    public void push(T elemento) {
        lista.add(elemento);
    }

    public T pop() {
        if (lista.getNumElementos() == 0) {
            throw new IllegalStateException("La pila está vacía");
        }


        T elemento = null;
        Iterador<T> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            elemento = iterador.next();
        }

        lista.delete(elemento);
        return elemento;
    }
}