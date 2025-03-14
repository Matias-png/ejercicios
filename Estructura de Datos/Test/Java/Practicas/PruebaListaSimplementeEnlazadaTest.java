package Practicas;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PruebaListaSimplementeEnlazadaTest {

    @Test
    void testListaSimplementeEnlazada() {
        Lista<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.delete(20);
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(List.of(10, 30), resultado);
    }

}