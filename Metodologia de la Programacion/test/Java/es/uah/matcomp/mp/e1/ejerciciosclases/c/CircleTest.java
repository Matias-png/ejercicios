package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @AfterEach
    void tearDown() {
        circle = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(1.0, circle.getRadius());
        assertEquals("red", circle.getColor());
    }

    @Test
    void testConstructorWithRadius() {
        Circle circleWithRadius = new Circle(2.0);
        assertEquals(2.0, circleWithRadius.getRadius());
        assertEquals("red", circleWithRadius.getColor());
    }

    @Test
    void testConstructorWithRadiusAndColor() {
        Circle circleWithRadiusAndColor = new Circle(2.0, "blue");
        assertEquals(2.0, circleWithRadiusAndColor.getRadius());
        assertEquals("blue", circleWithRadiusAndColor.getColor());
    }

    @Test
    void testGetArea() {
        assertEquals(Math.PI * 1.0 * 1.0, circle.getArea(), 0.0001);
    }

    @Test
    void testSetRadius() {
        circle.setRadius(3.0);
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    void testSetColor() {
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    void testToString() {
        String expected = "Circle[radius=1.0, color=red]";
        assertEquals(expected, circle.toString());
    }
}