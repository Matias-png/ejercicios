package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TestCirculo1Test {
    private Circle c1;
    private Circle c2;

    @BeforeEach
    void setUp() {
    c1 = new Circle(1.1);
    c2 = new Circle();
    }
    @AfterEach
    void tearDown() {
        c1 = null;
        c2 = null;
    }
    @Test
    void testConstructor() {
        assertEquals(1.1, c1.getRadius(), "El valor de radius debe ser 1.1");
    }
    @Test
    void testgetRadius() {
        assertEquals(1.1, c1.getRadius(), "El valor de radius debe ser 1.1");
    }
    @Test
    void testsetRadius() {
        c1.setRadius(2.2);
        assertEquals(2.2, c1.getRadius(), "El valor de radius debe ser 2.2");
    }
    @Test
    void testgetArea() {
        assertEquals(Math.PI * 1.1 * 1.1, c1.getArea(), "El valor de area debe ser pi * radius * radius");
    }
    @Test
    void testgetCircumference() {
        assertEquals(2 * Math.PI * 1.1, c1.getCircumference(), "El valor de circumference debe ser 2 * pi * radius");
    }
    @Test
    void testtoString() {
        String expected = "Circle[radius=1.1]";
        assertEquals(expected, c1.toString(), "El valor de toString() debe ser 'Circle[radius=1.1]'");
    }
}
