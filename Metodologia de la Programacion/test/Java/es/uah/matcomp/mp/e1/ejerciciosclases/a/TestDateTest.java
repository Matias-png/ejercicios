package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDateTest {
    private Date date1;

    @BeforeEach
    void setUp() {
        date1 = new Date(1, 2, 2020);
    }

    @AfterEach
    void tearDown() {
        date1 = null;
    }

    @Test
    void testConstructor() {
        assertEquals(1, date1.getDay());
        assertEquals(2, date1.getMonth());
        assertEquals(2020, date1.getYear());
    }

    @Test
    void testgetDay() {
        assertEquals(1, date1.getDay());
    }

    @Test
    void testgetMonth() {
        assertEquals(2, date1.getMonth());
    }

    @Test
    void testgetYear() {
        assertEquals(2020, date1.getYear());
    }

    @Test
    void testsetDay() {
        date1.setDay(15);
        assertEquals(15, date1.getDay());
    }

    @Test
    void testsetMonth() {
        date1.setMonth(8);
        assertEquals(8, date1.getMonth());
    }

    @Test
    void testsetYear() {
        date1.setYear(2023);
        assertEquals(2023, date1.getYear());
    }

    @Test
    void testtoString() {
        String expected = "01/02/2020";
        assertEquals(expected, date1.toString());
    }
}
