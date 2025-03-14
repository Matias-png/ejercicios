package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCircleTest {
    private MyCircle circle;

    @BeforeEach
    void setUp() {
        circle = new MyCircle(0, 0, 5);
    }

    @AfterEach
    void tearDown() {
        circle = null;
    }

    @Test
    void getRadius() {
        assertEquals(5, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getCenter() {
        assertEquals(new MyPoint(0, 0), circle.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint newCenter = new MyPoint(2, 3);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        assertEquals(0, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        circle.setCenterX(3);
        assertEquals(3, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        assertEquals(0, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        circle.setCenterY(4);
        assertEquals(4, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        assertArrayEquals(new int[]{0, 0}, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        circle.setCenterXY(5, 6);
        assertArrayEquals(new int[]{5, 6}, circle.getCenterXY());
    }

    @Test
    void testToString() {
        String expected = "MyCircle[ radius=5, center=MyPoint[x=0, y=0]]";
        assertEquals(expected, circle.toString());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI * 25, circle.getArea(), 0.0001);
    }

    @Test
    void getCircumference() {
        assertEquals(2 * Math.PI * 5, circle.getCircumference(), 0.0001);
    }

    @Test
    void distance() {
        MyCircle anotherCircle = new MyCircle(3, 4, 2);
        assertEquals(5, circle.distance(anotherCircle), 0.0001);
    }
}