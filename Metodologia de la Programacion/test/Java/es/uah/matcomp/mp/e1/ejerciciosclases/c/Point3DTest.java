package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point3DTest {
    private Point3D point;

    @BeforeEach
    void setUp() {
        point = new Point3D();
    }

    @AfterEach
    void tearDown() {
        point = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
        assertEquals(0.0f, point.getZ());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point3D pointWithCoordinates = new Point3D(1.0f, 2.0f, 3.0f);
        assertEquals(1.0f, pointWithCoordinates.getX());
        assertEquals(2.0f, pointWithCoordinates.getY());
        assertEquals(3.0f, pointWithCoordinates.getZ());
    }

    @Test
    void testSetZ() {
        point.setZ(5.0f);
        assertEquals(5.0f, point.getZ());
    }

    @Test
    void testSetXYZ() {
        point.setXYZ(1.0f, 2.0f, 3.0f);
        assertEquals(1.0f, point.getX());
        assertEquals(2.0f, point.getY());
        assertEquals(3.0f, point.getZ());
    }

    @Test
    void testGetXYZ() {
        point.setXYZ(1.0f, 2.0f, 3.0f);
        float[] coordinates = point.getXYZ();
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, coordinates);
    }

    @Test
    void testToString() {
        point.setXYZ(1.0f, 2.0f, 3.0f);
        String expected = "(1.0, 2.0, 3.0)";
        assertEquals(expected, point.toString());
    }
}