package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
    private Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog("Buddy");
    }

    @AfterEach
    void tearDown() {
        dog = null;
    }

    @Test
    void testToString() {
        String expected = "Dog[Mammal[Animal[name=Buddy]]]";
        assertEquals(expected, dog.toString());
    }

}