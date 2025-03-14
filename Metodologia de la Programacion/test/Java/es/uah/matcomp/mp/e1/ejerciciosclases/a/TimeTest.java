package es.uah.matcomp.mp.e1.ejerciciosclases.a;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time time;

    @BeforeEach
    void setUp() {
        time = new Time(10, 30, 45); // Inicializa el objeto Time con 10:30:45
    }

    @AfterEach
    void tearDown() {
        time = null; // Limpia después de cada prueba
    }

    @Test
    void getHour() {
        assertEquals(10, time.getHour(), "La hora debe ser 10");
    }

    @Test
    void getMinute() {
        assertEquals(30, time.getMinute(), "El minuto debe ser 30");
    }

    @Test
    void getSecond() {
        assertEquals(45, time.getSecond(), "El segundo debe ser 45");
    }

    @Test
    void setHour() {
        time.setHour(12);
        assertEquals(12, time.getHour(), "La hora debe ser 12");
    }

    @Test
    void setMinute() {
        time.setMinute(15);
        assertEquals(15, time.getMinute(), "El minuto debe ser 15");
    }

    @Test
    void setSecond() {
        time.setSecond(30);
        assertEquals(30, time.getSecond(), "El segundo debe ser 30");
    }

    @Test
    void setTime() {
        time.setTime(23, 59, 59);
        assertEquals(23, time.getHour(), "La hora debe ser 23");
        assertEquals(59, time.getMinute(), "El minuto debe ser 59");
        assertEquals(59, time.getSecond(), "El segundo debe ser 59");
    }

    @Test
    void testToString() {
        String expected = "10:30:45";
        assertEquals(expected, time.toString(), "El valor de toString() debe ser '10:30:45'");
    }

    @Test
    void nextSecond() {
        time.nextSecond();
        assertEquals(10, time.getHour(), "La hora debe seguir siendo 10");
        assertEquals(30, time.getMinute(), "El minuto debe seguir siendo 30");
        assertEquals(46, time.getSecond(), "El segundo debe ser 46");

        // Prueba el cambio de segundo a minuto
        time.setTime(10, 30, 59);
        time.nextSecond();
        assertEquals(10, time.getHour(), "La hora debe seguir siendo 10");
        assertEquals(31, time.getMinute(), "El minuto debe ser 31");
        assertEquals(0, time.getSecond(), "El segundo debe ser 0");

        // Prueba el cambio de minuto a hora
        time.setTime(10, 59, 59);
        time.nextSecond();
        assertEquals(11, time.getHour(), "La hora debe ser 11");
        assertEquals(0, time.getMinute(), "El minuto debe ser 0");
        assertEquals(0, time.getSecond(), "El segundo debe ser 0");

        // Prueba el cambio de hora a medianoche
        time.setTime(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour(), "La hora debe ser 0");
        assertEquals(0, time.getMinute(), "El minuto debe ser 0");
        assertEquals(0, time.getSecond(), "El segundo debe ser 0");
    }

    @Test
    void previousSecond() {
        time.previousSecond();
        assertEquals(10, time.getHour(), "La hora debe seguir siendo 10");
        assertEquals(30, time.getMinute(), "El minuto debe seguir siendo 30");
        assertEquals(44, time.getSecond(), "El segundo debe ser 44");

        // Prueba el cambio de segundo a minuto
        time.setTime(10, 30, 0);
        time.previousSecond();
        assertEquals(10, time.getHour(), "La hora debe seguir siendo 10");
        assertEquals(29, time.getMinute(), "El minuto debe ser 29");
        assertEquals(59, time.getSecond(), "El segundo debe ser 59");

    }
}