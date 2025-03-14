package es.uah.matcomp.mp.e1.ejerciciosclases.c.c35;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(4.0, 5.0, "blue", true); // Crea un objeto Rectangle
    }

    @AfterEach
    void tearDown() {
        rectangle = null; // Limpia la referencia al objeto Rectangle
    }

    @Test
    void testConstructor() {
        assertEquals(4.0, rectangle.getWidth());
        assertEquals(5.0, rectangle.getLength());
        assertEquals("blue", rectangle.getColor());
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testGetWidth() {
        assertEquals(4.0, rectangle.getWidth());
    }

    @Test
    void testSetWidth() {
        rectangle.setWidth(6.0);
        assertEquals(6.0, rectangle.getWidth());
    }

    @Test
    void testGetLength() {
        assertEquals(5.0, rectangle.getLength());
    }

    @Test
    void testSetLength() {
        rectangle.setLength(7.0);
        assertEquals(7.0, rectangle.getLength());
    }

    @Test
    void testGetArea() {
        assertEquals(20.0, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(18.0, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        String expected = "Rectangle [Shape[color=blue, filled=true],width=4.0,length=5.0]";
        assertEquals(expected, rectangle.toString());
    }
}