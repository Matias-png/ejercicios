package es.uah.matcomp.mp.e1.ejerciciosclases.c.c35;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Shape shape;

    @BeforeEach
    void setUp() {
        shape = new Shape("blue", false);
    }

    @AfterEach
    void tearDown() {
        shape = null;
    }

    @Test
    void testConstructor() {
        assertEquals("blue", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @Test
    void testGetColor() {
        assertEquals("blue", shape.getColor());
    }

    @Test
    void testSetColor() {
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    void testIsFilled() {
        assertFalse(shape.isFilled());
    }

    @Test
    void testSetFilled() {
        shape.setFilled(true);
        assertTrue(shape.isFilled());
    }

    @Test
    void testToString() {
        String expected = "Shape[color=blue, filled=false]";
        assertEquals(expected, shape.toString());
    }
}