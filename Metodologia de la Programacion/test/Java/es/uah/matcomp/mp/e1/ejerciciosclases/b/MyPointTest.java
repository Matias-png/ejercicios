package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPointTest {
    private MyPoint point;

    @BeforeEach
    void setUp() {
        point = new MyPoint(3, 4);
    }

    @AfterEach
    void tearDown() {
        point = null;
    }

    @Test
    void getX() {
        assertEquals(3, point.getX());
    }

    @Test
    void setX() {
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        assertEquals(4, point.getY());
    }

    @Test
    void setY() {
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void getXY() {
        assertArrayEquals(new int[]{3, 4}, point.getXY());
    }

    @Test
    void setXY() {
        point.setXY(7, 8);
        assertArrayEquals(new int[]{7, 8}, point.getXY());
    }

    @Test
    void testToString() {
        assertEquals("(3, 4)", point.toString());
    }

    @Test
    void distanceWithCoordinates() {
        assertEquals(5.0, point.distance(0, 0), 0.0001);
    }

    @Test
    void distanceWithAnotherPoint() {
        MyPoint anotherPoint = new MyPoint(0, 0);
        assertEquals(5.0, point.distance(anotherPoint), 0.0001);
    }

    @Test
    void distanceFromOrigin() {
        assertEquals(5.0, point.distance(), 0.0001);
    }
}