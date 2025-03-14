package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void setUp() {
        point = new Point(); // Crea un punto con el constructor por defecto
    }

    @AfterEach
    void tearDown() {
        point = null; // Limpia la referencia al objeto Point
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point pointWithCoordinates = new Point(3.0f, 4.0f);
        assertEquals(3.0f, pointWithCoordinates.getX());
        assertEquals(4.0f, pointWithCoordinates.getY());
    }

    @Test
    void testSetX() {
        point.setX(5.0f);
        assertEquals(5.0f, point.getX());
    }

    @Test
    void testSetY() {
        point.setY(6.0f);
        assertEquals(6.0f, point.getY());
    }

    @Test
    void testSetXY() {
        point.setXY(7.0f, 8.0f);
        assertEquals(7.0f, point.getX());
        assertEquals(8.0f, point.getY());
    }

    @Test
    void testMoveXY() {
        point.setXY(1.0f, 2.0f);
        float[] coordinates = point.moveXY();
        assertArrayEquals(new float[]{1.0f, 2.0f}, coordinates);
    }

    @Test
    void testToString() {
        point.setXY(3.0f, 4.0f);
        String expected = "(3.0, 4.0)";
        assertEquals(expected, point.toString());
    }
}