package Practicas;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PruebaListaDoblementeEnlazadaTest {
    @Test
    void testListaDoblementeEnlazada() {
        Lista<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.add(5);
        lista.add(15);
        lista.add(25);
        lista.delete(15);
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(List.of(5, 25), resultado);


    }
}