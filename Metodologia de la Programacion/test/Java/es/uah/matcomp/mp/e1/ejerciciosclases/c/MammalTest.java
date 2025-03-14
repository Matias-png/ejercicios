package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalTest {
    private Mammal mammal;

    @BeforeEach
    void setUp() {
        mammal = new Mammal("Elephant"); // Crea un mamífero con el nombre "Elephant"
    }

    @AfterEach
    void tearDown() {
        mammal = null; // Limpia la referencia al objeto Mammal
    }

    @Test
    void testToString() {
        String expected = "Mammal[Animal[name=Elephant]]"; // Asumiendo que Animal tiene un toString() que devuelve "Animal[name=Elephant]"
        assertEquals(expected, mammal.toString());
    }
}