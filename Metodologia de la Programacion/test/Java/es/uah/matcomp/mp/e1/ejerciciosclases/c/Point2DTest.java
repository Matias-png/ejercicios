package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {
    private Point2D point;

    @BeforeEach
    void setUp() {
        point = new Point2D();
    }

    @AfterEach
    void tearDown() {
        point = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point2D pointWithCoordinates = new Point2D(3.0f, 4.0f);
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
    void testGetXY() {
        point.setXY(1.0f, 2.0f);
        float[] coordinates = point.getXY();
        assertArrayEquals(new float[]{1.0f, 2.0f}, coordinates);
    }

    @Test
    void testToString() {
        point.setXY(3.0f, 4.0f);
        String expected = "(3.0, 4.0)";
        assertEquals(expected, point.toString());
    }
}