package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDateTest {
    private Date date1;

    @BeforeEach
    void setUp() {
        date1 = new Date(1, 2, 2020);  // Inicializa la fecha con día=1, mes=2, año=2020
    }

    @AfterEach
    void tearDown() {
        date1 = null;  // Limpia después de cada prueba
    }

    @Test
    void testConstructor() {
        // Verifica que el constructor inicializa correctamente los valores
        assertEquals(1, date1.getDay(), "El día debe ser 1");
        assertEquals(2, date1.getMonth(), "El mes debe ser 2");
        assertEquals(2020, date1.getYear(), "El año debe ser 2020");
    }

    @Test
    void testgetDay() {
        // Verifica que el método getDay() devuelve el día correcto
        assertEquals(1, date1.getDay(), "El método getDay() debe devolver 1");
    }

    @Test
    void testgetMonth() {
        // Verifica que el método getMonth() devuelve el mes correcto
        assertEquals(2, date1.getMonth(), "El método getMonth() debe devolver 2");
    }

    @Test
    void testgetYear() {
        // Verifica que el método getYear() devuelve el año correcto
        assertEquals(2020, date1.getYear(), "El método getYear() debe devolver 2020");
    }

    @Test
    void testsetDay() {
        // Verifica que el método setDay() actualiza el valor del día correctamente
        date1.setDay(15);
        assertEquals(15, date1.getDay(), "El método setDay() debe establecer el día a 15");
    }

    @Test
    void testsetMonth() {
        // Verifica que el método setMonth() actualiza el valor del mes correctamente
        date1.setMonth(8);
        assertEquals(8, date1.getMonth(), "El método setMonth() debe establecer el mes a 8");
    }

    @Test
    void testsetYear() {
        // Verifica que el método setYear() actualiza el valor del año correctamente
        date1.setYear(2023);
        assertEquals(2023, date1.getYear(), "El método setYear() debe establecer el año a 2023");
    }

    @Test
    void testtoString() {
        // Verifica que el método toString() devuelve la representación correcta de la fecha
        String expected = "01/02/2020";
        assertEquals(expected, date1.toString(), "El valor de toString() debe ser 'Date[day=1, month=2, year=2020]'");
    }
}
