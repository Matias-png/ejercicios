package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovablePointTest {
    private MovablePoint movablePoint;

    @BeforeEach
    void setUp() {
        movablePoint = new MovablePoint(1, 2, 0.5f, 0.5f);
    }

    @AfterEach
    void tearDown() {
        movablePoint = null; // Limpia la referencia al objeto MovablePoint
    }

    @Test
    void testDefaultConstructor() {
        MovablePoint defaultPoint = new MovablePoint();
        assertEquals(0.0f, defaultPoint.getX());
        assertEquals(0.0f, defaultPoint.getY());
        assertEquals(0.0f, defaultPoint.getXSpeed());
        assertEquals(0.0f, defaultPoint.getYSpeed());
    }

    @Test
    void testConstructorWithCoordinatesAndSpeed() {
        assertEquals(1.0f, movablePoint.getX());
        assertEquals(2.0f, movablePoint.getY());
        assertEquals(0.5f, movablePoint.getXSpeed());
        assertEquals(0.5f, movablePoint.getYSpeed());
    }

    @Test
    void testSetSpeed() {
        movablePoint.setSpeed(1.0f, 1.0f);
        assertEquals(1.0f, movablePoint.getXSpeed());
        assertEquals(1.0f, movablePoint.getYSpeed());
    }

    @Test
    void testMove() {
        movablePoint.move(); // Mueve el punto
        assertEquals(1.5f, movablePoint.getX()); // 1.0 + 0.5
        assertEquals(2.5f, movablePoint.getY()); // 2.0 + 0.5
    }

    @Test
    void testToString() {
        String expected = "(1.0, 2.0), speed=(0.5,0.5)";
        assertEquals(expected, movablePoint.toString());
    }
}