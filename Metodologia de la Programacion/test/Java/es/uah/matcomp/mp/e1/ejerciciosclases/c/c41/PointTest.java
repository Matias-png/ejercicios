package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void setUp() {
        point = new Point(3, 4);
    }

    @AfterEach
    void tearDown() {
        // Aquí podrías limpiar recursos si fuera necesario
    }

    @Test
    void testToString() {
        assertEquals("Point: (3,4)", point.toString());
    }

    @Test
    void testGetX() {
        assertEquals(3, point.getX());
    }

    @Test
    void testGetY() {
        assertEquals(4, point.getY());
    }

    @Test
    void testSetX() {
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void testSetY() {
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void testSetXY() {
        point.setXY(7, 8);
        assertEquals(7, point.getX());
        assertEquals(8, point.getY());
    }
}