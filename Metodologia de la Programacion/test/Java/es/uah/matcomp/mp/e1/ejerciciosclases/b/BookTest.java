package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    private Author author;
    private Book book;

    @BeforeEach
    void setUp() {
        author = new Author("John Doe", "john.doe@example.com");
        book = new Book("1234567890", "Java Programming", author, 29.99, 10);
    }

    @AfterEach
    void tearDown() {
        author = null;
        book = null;
    }

    @Test
    void getIsbn() {
        assertEquals("1234567890", book.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("Java Programming", book.getName());
    }

    @Test
    void getAuthor() {
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(29.99, book.getPrice());
    }

    @Test
    void setPrice() {
        book.setPrice(34.99);
        assertEquals(34.99, book.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(10, book.getQty());
    }

    @Test
    void setQty() {
        book.setQty(15);
        assertEquals(15, book.getQty());
    }

    @Test
    void getAuthorName() {
        assertEquals("John Doe", book.getAuthorName());
    }

    @Test
    void testToString() {
        String expected = "Book[isbn=1234567890, name=Java Programming, author=Author[name=John Doe, email=john.doe@example.com], price=29.99, qty=10]";
        assertEquals(expected, book.toString());
    }
}