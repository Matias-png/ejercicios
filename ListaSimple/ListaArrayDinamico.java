package ListaSimple;// ListaArrayDinamico.java
import java.util.Arrays;

public class ListaArrayDinamico<T> implements Lista<T> {
    private static final int CAPACIDAD_INICIAL = 10; // Capacidad inicial del array
    private T[] elementos; // Array para almacenar los elementos
    private int numElementos; // Número de elementos en la lista

    // Constructor
    public ListaArrayDinamico() {
        this.elementos = (T[]) new Object[CAPACIDAD_INICIAL];
        this.numElementos = 0;
    }

    public boolean add(T elemento) {
        // Si el array está lleno, se duplica su capacidad
        if (numElementos == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }

        elementos[numElementos++] = elemento; // Añade el elemento al final
        return true;
    }


    public boolean delete(T elemento) {
        for (int i = 0; i < numElementos; i++) {
            if (elementos[i].equals(elemento)) {
                // Desplaza los elementos restantes hacia la izquierda
                System.arraycopy(elementos, i + 1, elementos, i, numElementos - i - 1);
                elementos[--numElementos] = null; // Elimina la referencia al último elemento
                return true;
            }
        }
        return false; // El elemento no se encontró
    }


    public Iterador<T> getIterador() {
        return new IteradorArray<>(Arrays.copyOf(elementos, numElementos)); // Devuelve un iterador
    }


    public int getNumElementos() {
        return numElementos; // Devuelve el número de elementos
    }
    }