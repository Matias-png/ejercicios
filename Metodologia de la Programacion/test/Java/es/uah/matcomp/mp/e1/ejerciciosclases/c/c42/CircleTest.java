package es.uah.matcomp.mp.e1.ejerciciosclases.c.c42;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(3.0, "red");
    }

    @AfterEach
    void tearDown() {
        // Aquí podrías limpiar recursos si fuera necesario
    }

    @Test
    void testGetRadius() {
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    void testSetRadius() {
        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void testGetColor() {
        assertEquals("red", circle.getColor());
    }

    @Test
    void testSetColor() {
        circle.setColor("blue");
        assertEquals("blue", circle.getColor());
    }

    @Test
    void testGetArea() {
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea(), 0.001);
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=3.0, color=red]", circle.toString());
    }
}