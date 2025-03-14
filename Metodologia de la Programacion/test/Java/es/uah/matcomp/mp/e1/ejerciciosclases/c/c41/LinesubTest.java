package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinesubTest {
    private Point beginPoint;
    private Point endPoint;
    private Linesub line;

    @BeforeEach
    void setUp() {
        beginPoint = new Point(1, 2);
        endPoint = new Point(4, 6);
        line = new Linesub(beginPoint, endPoint);
    }

    @AfterEach
    void tearDown() {
        // Aquí podrías limpiar recursos si fuera necesario
    }

    @Test
    void testToString() {
        assertEquals("((1, 2), (4, 6))", line.toString());
    }

    @Test
    void testGetBegin() {
        assertEquals(beginPoint, line.getBegin());
    }

    @Test
    void testGetEnd() {
        assertEquals(endPoint, line.getEnd());
    }

    @Test
    void testSetBegin() {
        Point newBegin = new Point(0, 0);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void testSetEnd() {
        Point newEnd = new Point(10, 10);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void testGetBeginX() {
        assertEquals(1, line.getBeginX());
    }

    @Test
    void testGetBeginY() {
        assertEquals(2, line.getBeginY());
    }

    @Test
    void testGetEndX() {
        assertEquals(4, line.getEndX());
    }

    @Test
    void testGetEndY() {
        assertEquals(6, line.getEndY());
    }

    @Test
    void testSetBeginX() {
        line.setBeginX(3);
        assertEquals(3, line.getBeginX());
    }

    @Test
    void testSetBeginY() {
        line.setBeginY(4);
        assertEquals(4, line.getBeginY());
    }

    @Test
    void testSetEndX() {
        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void testSetEndY() {
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void testGetLength() {
        assertEquals(5.0, line.getLength(), 0.001); // Distancia entre (1,2) y (4,6)
    }

    @Test
    void testGetGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.001); // Gradiente entre (1,2) y (4,6)
    }
}