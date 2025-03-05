package src;

public class ListaSimplementeEnlazada<T> implements Lista<T> {
    private Elementos<T> cabeza;

    public ListaSimplementeEnlazada() {
        this.cabeza = null;
    }

    @Override
    public boolean add(T elemento) {
        Elementos<T> nuevo = new Elementos<>(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Elementos<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) return false;

        if (cabeza.getDato().equals(elemento)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Elementos<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(elemento)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaSimplementeEnlazada<>(cabeza);
    }

    @Override
    public int getNumElementos() {
        int contador = 0;
        Elementos<T> actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
}
