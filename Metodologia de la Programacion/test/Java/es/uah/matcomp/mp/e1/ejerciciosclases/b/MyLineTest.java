package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLineTest {
    private MyLine line;

    @BeforeEach
    void setUp() {
        line = new MyLine(0, 0, 3, 4);
    }

    @AfterEach
    void tearDown() {
        line = null;
    }

    @Test
    void getBegin() {
        assertEquals(new MyPoint(0, 0), line.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint newBegin = new MyPoint(1, 1);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void getEnd() {
        assertEquals(new MyPoint(3, 4), line.getEnd());
    }

    @Test
    void setEnd() {
        MyPoint newEnd = new MyPoint(5, 5);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        assertEquals(0, line.getBeginX());
    }

    @Test
    void setBeginX() {
        line.setBeginX(2);
        assertEquals(2, line.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(0, line.getBeginY());
    }

    @Test
    void setBeginY() {
        line.setBeginY(2);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(3, line.getEndX());
    }

    @Test
    void setEndX() {
        line.setEndX(6);
        assertEquals(6, line.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(4, line.getEndY());
    }

    @Test
    void setEndY() {
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void getBeginXY() {
        assertArrayEquals(new int[]{0, 0}, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        line.setBeginXY(1, 1);
        assertArrayEquals(new int[]{1, 1}, line.getBeginXY());
    }

    @Test
    void getEndXY() {
        assertArrayEquals(new int[]{3, 4}, line.getEndXY());
    }

    @Test
    void setEndXY() {
        line.setEndXY(5, 5);
        assertArrayEquals(new int[]{5, 5}, line.getEndXY());
    }

    @Test
    void getLength() {
        assertEquals(5.0, line.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        String expected = "MyLine[begin=MyPoint[x=0, y=0], end=MyPoint[x=3, y=4]]";
        assertEquals(expected, line.toString());
    }
}