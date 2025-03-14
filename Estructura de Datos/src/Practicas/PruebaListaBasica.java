package Practicas;

public class PruebaListaBasica {


    void testListaBasica() {
        Lista<Integer> lista = new ListaBasica<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.delete(2);
        Lista<Integer> resultado = new ListaBasica<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        }
    }


