package es.uah.matcomp.mp.e1.ejerciciosclases.c.c42;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {
    private Cylinder cylinder;

    @BeforeEach
    void setUp() {
        cylinder = new Cylinder(3.0, 5.0, "red");
    }

    @AfterEach
    void tearDown() {
        // Aquí podrías limpiar recursos si fuera necesario
    }

    @Test
    void testGetHeight() {
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    void testSetHeight() {
        cylinder.setHeight(10.0);
        assertEquals(10.0, cylinder.getHeight());
    }

    @Test
    void testGetVolume() {
        assertEquals(Math.PI * 3.0 * 3.0 * 5.0, cylinder.getVolume(), 0.001);
    }

    @Test
    void testGetArea() {
        double radius = 3.0;
        double expectedArea = 2 * Math.PI * radius * 5.0 + 2 * Math.PI * radius * radius;
        assertEquals(expectedArea, cylinder.getArea(), 0.001);
    }

    @Test
    void testToString() {
        assertEquals("Cylinder: subclass of Circle[radius=3.0, color=red] height=5.0", cylinder.toString());
    }
}