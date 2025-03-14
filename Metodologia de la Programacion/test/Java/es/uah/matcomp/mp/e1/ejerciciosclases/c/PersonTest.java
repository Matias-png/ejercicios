package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John Doe", "123 Main St");
    }

    @AfterEach
    void tearDown() {
        person = null;
    }

    @Test
    void testConstructor() {
        assertEquals("John Doe", person.getName());
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    void testGetAddress() {
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    void testSetAddress() {
        person.setAddress("456 Elm St");
        assertEquals("456 Elm St", person.getAddress());
    }

    @Test
    void testToString() {
        String expected = "Person[name=John Doe, address=123 Main St]";
        assertEquals(expected, person.toString());
    }
}