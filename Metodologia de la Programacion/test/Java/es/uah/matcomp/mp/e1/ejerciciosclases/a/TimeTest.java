package es.uah.matcomp.mp.e1.ejerciciosclases.a;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {
    private Time time;

    @BeforeEach
    void setUp() {
        time = new Time(10, 30, 45);
    }

    @AfterEach
    void tearDown() {
        time = null; // Limpia después de cada prueba
    }

    @Test
    void getHour() {
        assertEquals(10, time.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(30, time.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(45, time.getSecond());
    }

    @Test
    void setHour() {
        time.setHour(12);
        assertEquals(12, time.getHour());
    }

    @Test
    void setMinute() {
        time.setMinute(15);
        assertEquals(15, time.getMinute());
    }

    @Test
    void setSecond() {
        time.setSecond(30);
        assertEquals(30, time.getSecond());
    }

    @Test
    void setTime() {
        time.setTime(23, 59, 59);
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());
    }

    @Test
    void testToString() {
        String expected = "10:30:45";
        assertEquals(expected, time.toString());
    }

    @Test
    void nextSecond() {
        time.nextSecond();
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(46, time.getSecond());

        // Prueba el cambio de segundo a minuto
        time.setTime(10, 30, 59);
        time.nextSecond();
        assertEquals(10, time.getHour());
        assertEquals(31, time.getMinute());
        assertEquals(0, time.getSecond());

        // Prueba el cambio de minuto a hora
        time.setTime(10, 59, 59);
        time.nextSecond();
        assertEquals(11, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());

        // Prueba el cambio de hora a medianoche
        time.setTime(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    void previousSecond() {
        time.previousSecond();
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(44, time.getSecond());

        // Prueba el cambio de segundo a minuto
        time.setTime(10, 30, 0);
        time.previousSecond();
        assertEquals(10, time.getHour());
        assertEquals(29, time.getMinute());
        assertEquals(59, time.getSecond());

    }
}