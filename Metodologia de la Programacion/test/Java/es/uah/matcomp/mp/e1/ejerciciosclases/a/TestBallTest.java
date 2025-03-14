package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(expected, ball1.toString(), "El método toString() no devuelve el formato esperado");
    }
    @Test
    void testgetX(){
        assertEquals(1.1f, ball1.getX(), "El valor de X debe ser 1.1");
    }
    @Test
    void testsetX() {
        ball1.setX(10.0f);
        assertEquals(10.0f, ball1.getX(), "El valor de X debe ser 10.0");
    }
    @Test
    void testgetY(){
        assertEquals(2.2f, ball1.getY(), "El valor de Y debe ser 2.2");
    }
    @Test
    void testsetY() {
        ball1.setY(10.0f);
        assertEquals(10.0f, ball1.getY(), "El valor de Y debe ser 10.0");
    }
    @Test
    void testgetRadius(){
        assertEquals(10, ball1.getRadius(), "El valor de radius debe ser 10");
    }
    @Test
    void testsetRadius() {
        ball1.setRadius(10);
        assertEquals(10, ball1.getRadius(), "El valor de radius debe ser 10");
    }
    @Test
    void testgetXDelta(){
        assertEquals(3.3f, ball1.getXDelta(), "El valor de xDelta debe ser 3.3");
    }
    @Test
    void testsetXDelta() {
        ball1.setXDelta(10.0f);
        assertEquals(10.0f, ball1.getXDelta(), "El valor de xDelta debe ser 10.0");
    }
    @Test
    void testgetYDelta(){
        assertEquals(4.4f, ball1.getYDelta(), "El valor de yDelta debe ser 4.4");
    }
    @Test
    void testsetYDelta() {
        ball1.setYDelta(10.0f);
        assertEquals(10.0f, ball1.getYDelta(), "El valor de yDelta debe ser 10.0");
    }

    @Test
    void testmove(){
        ball1.move();
        assertEquals(1.1f + 3.3f, ball1.getX(), "El valor de X debe ser 1.1 + 3.3");
        assertEquals(2.2f + 4.4f, ball1.getY(), "El valor de Y debe ser 2.2 + 4.4");
    }
    @Test
    void testreflectHorizontal(){
        ball1.reflectHorizontal();
        assertEquals(-3.3f, ball1.getXDelta(), "El valor de xDelta debe ser -3.3");
    }
    @Test
    void testreflectVertical(){
        ball1.reflectVertical();
        assertEquals(-4.4f, ball1.getYDelta(), "El valor de yDelta debe ser -4.4");
    }
}

