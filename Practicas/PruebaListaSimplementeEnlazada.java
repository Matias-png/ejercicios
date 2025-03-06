package Practicas;

public class PruebaListaSimplementeEnlazada {
    void testListaSimplementeEnlazada() {
        Lista<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.delete(20);
        Lista<Integer> resultado = new ListaSimplementeEnlazada<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());

        }
    }
}
