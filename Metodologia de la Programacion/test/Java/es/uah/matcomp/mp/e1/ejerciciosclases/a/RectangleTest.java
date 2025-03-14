package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(5.0f, rectangle.getLength(), "La longitud debe ser 5.0");
    }

    @Test
    void setLength() {
        rectangle.setLength(10.0f);
        assertEquals(10f, rectangle.getLength(), "La longitud debe ser 10.0");
    }

    @Test
    void getWidth() {
        assertEquals(3.0f, rectangle.getWidth(), "El ancho debe ser 3.0");
    }

    @Test
    void setWidth() {
        rectangle.setWidth(4.0f);
        assertEquals(4.0f, rectangle.getWidth(), "El ancho debe ser 5.0");
    }

    @Test
    void getArea() {
        assertEquals(15.0f, rectangle.getArea(), "El área debe ser 15.0");
    }

    @Test
    void getPerimeter() {
        assertEquals(16.0f, rectangle.getPerimeter(), "El perímetro debe ser 16.0");
    }

    @Test
    void testToString() {
        String expected = "Rectangulo[length=5.0, width=3.0]";
        assertEquals(expected, rectangle.toString(), "El valor de toString() debe ser 'Rectangulo[length=5.0, width=3.0]'");

    }
}