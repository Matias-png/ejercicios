package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {
    private Cylinder cylinder;

    @BeforeEach
    void setUp() {
        cylinder = new Cylinder();
    }

    @AfterEach
    void tearDown() {
        cylinder = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(1.0, cylinder.getHeight());
        assertEquals(1.0, cylinder.getRadius());
        assertEquals("red", cylinder.getColor());
    }

    @Test
    void testConstructorWithRadius() {
        Cylinder cylinderWithRadius = new Cylinder(2.0);
        assertEquals(2.0, cylinderWithRadius.getRadius());
        assertEquals(1.0, cylinderWithRadius.getHeight());
        assertEquals("red", cylinderWithRadius.getColor());
    }

    @Test
    void testConstructorWithRadiusAndHeight() {
        Cylinder cylinderWithRadiusAndHeight = new Cylinder(2.0, 3.0);
        assertEquals(2.0, cylinderWithRadiusAndHeight.getRadius());
        assertEquals(3.0, cylinderWithRadiusAndHeight.getHeight());
        assertEquals("red", cylinderWithRadiusAndHeight.getColor());
    }

    @Test
    void testConstructorWithRadiusHeightAndColor() {
        Cylinder cylinderWithAllParams = new Cylinder(2.0, 3.0, "blue");
        assertEquals(2.0, cylinderWithAllParams.getRadius());
        assertEquals(3.0, cylinderWithAllParams.getHeight());
        assertEquals("blue", cylinderWithAllParams.getColor());
    }

    @Test
    void testGetVolume() {
        assertEquals(Math.PI * 1.0 * 1.0 * 1.0, cylinder.getVolume(), 0.0001);
    }

    @Test
    void testGetArea() {
        assertEquals(2 * Math.PI * 1.0 * 1.0 + 2 * Math.PI * 1.0 * 1.0, cylinder.getArea(), 0.0001);
    }

    @Test
    void testSetHeight() {
        cylinder.setHeight(5.0);
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    void testToString() {
        String expected = "Cylinder: subclass of Circle[radius=1.0, color=red] height=1.0";
        assertEquals(expected, cylinder.toString());
    }
}