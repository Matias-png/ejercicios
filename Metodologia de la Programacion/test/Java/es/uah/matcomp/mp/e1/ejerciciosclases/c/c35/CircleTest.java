package es.uah.matcomp.mp.e1.ejerciciosclases.c.c35;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(5.0, "red", true);
    }

    @AfterEach
    void tearDown() {
        circle = null;
    }

    @Test
    void testConstructor() {
        assertEquals(5.0, circle.getRadius());
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
    }

    @Test
    void testGetRadius() {
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void testSetRadius() {
        circle.setRadius(10.0);
        assertEquals(10.0, circle.getRadius());
    }

    @Test
    void testGetArea() {
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        String expected = "Circle[Shape[color=red, filled=true],radius=5.0]";
        assertEquals(expected, circle.toString());
    }
}