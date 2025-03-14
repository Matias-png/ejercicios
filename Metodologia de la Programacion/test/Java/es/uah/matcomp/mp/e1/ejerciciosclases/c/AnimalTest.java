package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal("Lion");
    }

    @AfterEach
    void tearDown() {
        animal = null;
    }

    @Test
    void testToString() {
        String expected = "Animal[name=Lion]";
        assertEquals(expected, animal.toString());
    }
}