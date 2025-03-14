package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    private Rectangle rectangle;
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(5.0f, 3.0f);
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
    }
    @Test
    void getLength() {
        assertEquals(5.0f, rectangle.getLength());
    }

    @Test
    void setLength() {
        rectangle.setLength(10.0f);
        assertEquals(10f, rectangle.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(3.0f, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(4.0f);
        assertEquals(4.0f, rectangle.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(15.0f, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(16.0f, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        String expected = "Rectangulo[length=5.0, width=3.0]";
        assertEquals(expected, rectangle.toString());

    }
}