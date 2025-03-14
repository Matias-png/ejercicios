package Practicas;

public class PruebaListaDoblementeEnlazada {

    void testListaDoblementeEnlazada() {
        Lista<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(5);
        lista.add(15);
        lista.add(25);
        lista.delete(15);
        Lista<Integer> resultado = new ListaDoblementeEnlazada<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }

    }
}