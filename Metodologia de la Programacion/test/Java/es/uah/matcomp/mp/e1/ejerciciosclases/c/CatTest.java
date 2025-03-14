package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {
    private Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat("Pepe");
    }

    @AfterEach
    void tearDown() {
        cat = null;
    }

    @Test
    void testToString() {
        String expected = "Cat[Animal[name=Pepe]]";
        assertEquals(expected, cat.toString());
    }

}