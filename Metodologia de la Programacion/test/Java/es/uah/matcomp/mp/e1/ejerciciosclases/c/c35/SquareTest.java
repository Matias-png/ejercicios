package es.uah.matcomp.mp.e1.ejerciciosclases.c.c35;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(4.0, "green", true); // Crea un objeto Square
    }

    @AfterEach
    void tearDown() {
        square = null; // Limpia la referencia al objeto Square
    }

    @Test
    void testConstructor() {
        assertEquals(4.0, square.getSide());
        assertEquals("green", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testGetSide() {
        assertEquals(4.0, square.getSide());
    }

    @Test
    void testSetSide() {
        square.setSide(5.0);
        assertEquals(5.0, square.getSide());
        assertEquals(5.0, square.getLength());
        assertEquals(4.0, square.getWidth());
    }

    @Test
    void testSetLength() {
        square.setLength(6.0);
        assertEquals(6.0, square.getSide());
        assertEquals(6.0, square.getLength());
        assertEquals(6.0, square.getWidth());
    }

    @Test
    void testToString() {
        String expected = "Square[Rectangle[Square[Rectangle [Shape[color=green, filled=true],width=4.0,length=4.0]]";
        assertEquals(expected, square.toString());
    }
}