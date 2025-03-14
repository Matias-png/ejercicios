package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {
    private Point point1;
    private Point point2;
    private Line line;

    @BeforeEach
    void setUp() {
        point1 = new Point(1, 2);
        point2 = new Point(4, 6);
        line = new Line(point1, point2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        assertEquals("(1, 2) (4, 6)", line.toString());
    }

    @Test
    void getBegin() {
        assertEquals(point1, line.getBegin());
    }

    @Test
    void getEnd() {
        assertEquals(point2, line.getEnd());
    }

    @Test
    void setBegin() {
        Point newBegin = new Point(0, 0);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void setEnd() {
        Point newEnd = new Point(10, 10);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(4, line.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(6, line.getEndY());
    }

    @Test
    void setBeginX() {
        line.setBeginX(3);
        assertEquals(3, line.getBeginX());
    }

    @Test
    void setBeginY() {
        line.setBeginY(4);
        assertEquals(4, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        line.setBeginXY(2, 3);
        assertEquals(2, line.getBeginX());
        assertEquals(3, line.getBeginY());
    }

    @Test
    void setEndX() {
        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void setEndY() {
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void setEndXY() {
        line.setEndXY(5, 7);
        assertEquals(5, line.getEndX());
        assertEquals(7, line.getEndY());
    }

    @Test
    void getLength() {
        assertEquals(5.0, line.getLength(), 0.001); // Distancia entre (1,2) y (4,6)
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.001); // Gradiente entre (1,2) y (4,6)
    }
}