package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBallTest {

    private Ball ball1;

    @BeforeEach
    void setUp() {
        ball1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
    }

    @AfterEach
    void tearDown() {
        ball1 = null;
    }
    @Test
    void testConstructor() {
        String expected = "Ball[(1.1, 2.2), speed= (3.3, 4.4) ]";
        assertEquals(expected, ball1.toString());
    }
    @Test
    void testgetX(){
        assertEquals(1.1f, ball1.getX());
    }
    @Test
    void testsetX() {
        ball1.setX(10.0f);
        assertEquals(10.0f, ball1.getX());
    }
    @Test
    void testgetY(){
        assertEquals(2.2f, ball1.getY());
    }
    @Test
    void testsetY() {
        ball1.setY(10.0f);
        assertEquals(10.0f, ball1.getY());
    }
    @Test
    void testgetRadius(){
        assertEquals(10, ball1.getRadius());
    }
    @Test
    void testsetRadius() {
        ball1.setRadius(10);
        assertEquals(10, ball1.getRadius());
    }
    @Test
    void testgetXDelta(){
        assertEquals(3.3f, ball1.getXDelta());
    }
    @Test
    void testsetXDelta() {
        ball1.setXDelta(10.0f);
        assertEquals(10.0f, ball1.getXDelta());
    }
    @Test
    void testgetYDelta(){
        assertEquals(4.4f, ball1.getYDelta());
    }
    @Test
    void testsetYDelta() {
        ball1.setYDelta(10.0f);
        assertEquals(10.0f, ball1.getYDelta());
    }

    @Test
    void testmove(){
        ball1.move();
        assertEquals(1.1f + 3.3f, ball1.getX());
        assertEquals(2.2f + 4.4f, ball1.getY());
    }
    @Test
    void testreflectHorizontal(){
        ball1.reflectHorizontal();
        assertEquals(-3.3f, ball1.getXDelta());
    }
    @Test
    void testreflectVertical(){
        ball1.reflectVertical();
        assertEquals(-4.4f, ball1.getYDelta());
    }
}

