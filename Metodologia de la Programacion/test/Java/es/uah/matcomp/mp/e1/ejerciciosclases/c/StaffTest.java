package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {
    private Staff staff;

    @BeforeEach
    void setUp() {
        staff = new Staff("Alice Smith", "456 School Rd", "Greenwood High", 50000.0); // Crea un objeto Staff
    }

    @AfterEach
    void tearDown() {
        staff = null; // Limpia la referencia al objeto Staff
    }

    @Test
    void testConstructor() {
        assertEquals("Alice Smith", staff.getName());
        assertEquals("456 School Rd", staff.getAddress());
        assertEquals("Greenwood High", staff.getSchool());
        assertEquals(50000.0, staff.getPay());
    }

    @Test
    void testGetSchool() {
        assertEquals("Greenwood High", staff.getSchool());
    }

    @Test
    void testSetSchool() {
        staff.setSchool("Maple Leaf Academy");
        assertEquals("Maple Leaf Academy", staff.getSchool());
    }

    @Test
    void testGetPay() {
        assertEquals(50000.0, staff.getPay());
    }

    @Test
    void testSetPay() {
        staff.setPay(55000.0);
        assertEquals(55000.0, staff.getPay());
    }

    @Test
    void testToString() {
        String expected = "Staff [ Person = Person[name=Alice Smith, address=456 School Rd], school = Greenwood High, pay = 50000.0]";
        assertEquals(expected, staff.toString());
    }
}