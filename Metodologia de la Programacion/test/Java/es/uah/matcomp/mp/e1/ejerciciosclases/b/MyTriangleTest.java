package es.uah.matcomp.mp.e1.ejerciciosclases.b;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MyTriangleTest {
    private MyTriangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new MyTriangle(0, 0, 3, 4, 0, 4);
    }

    @AfterEach
    void tearDown() {
        triangle = null;
    }

    @Test
    void testToString() {
        String expected = "My Triangle[v1=(0, 0),v2= (3, 4),v3= (0, 4)]";
        assertEquals(expected, triangle.toString());
    }

    @Test
    void getPerimeter() {
        double expectedPerimeter = triangle.getPerimeter();
        assertEquals(12.0, expectedPerimeter, 0.0001);
    }

    @Test
    void getTypeEquilateral() {
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 1, (int) (Math.sqrt(3)), 2, 0);
        assertEquals("Equilateral", equilateralTriangle.getType());
    }

    @Test
    void getTypeIsosceles() {
        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 2, 0, 1, 2);
        assertEquals("Isosceles", isoscelesTriangle.getType());
    }

    @Test
    void getTypeScalene() {
        MyTriangle scaleneTriangle = new MyTriangle(0, 0, 2, 1, 1, 3);
        assertEquals("Scalene", scaleneTriangle.getType());
    }

    @Test
    void getTypeNull() {
        MyTriangle degenerateTriangle = new MyTriangle(0, 0, 1, 1, 2, 2);
        assertNull(degenerateTriangle.getType());
    }
}