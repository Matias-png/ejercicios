package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {
    private Author author;

    @BeforeEach
    void setUp() {
        author = new Author("John Doe", "john.doe@example.com");
    }

    @AfterEach
    void tearDown() {
        author = null;
    }

    @Test
    void getName() {
        assertEquals("John Doe", author.getName());
    }

    @Test
    void getEmail() {
        assertEquals("john.doe@example.com", author.getEmail());
    }

    @Test
    void setEmail() {
        author.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        String expected = "Author[name=John Doe, email=john.doe@example.com]";
        assertEquals(expected, author.toString());
    }
}