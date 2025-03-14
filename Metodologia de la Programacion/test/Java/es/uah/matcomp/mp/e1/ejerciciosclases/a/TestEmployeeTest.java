package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(1, "John", "Doe", 3000);

    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void getId() {
        assertEquals(1, employee.getId());
    }

    @Test
    void getFirstName() {
        assertEquals("John", employee.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Doe", employee.getLastName());
    }

    @Test
    void getName() {
        assertEquals("John Doe", employee.getName());
    }

    @Test
    void getSalary() {
        assertEquals(3000, employee.getSalary());
    }

    @Test
    void setSalary() {
        employee.setSalary(2000);
        assertEquals(2000, employee.getSalary());

    }

    @Test
    void getAnnualSalary() {
        assertEquals(36000, employee.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        int newSalary = employee.raiseSalary(10);
        assertEquals(3300, newSalary);
        assertEquals(3300, employee.getSalary());
    }

    @Test
    void testToString() {
        String expected = "Employee[id=1, Name=John Doe, salary=3000]";
        assertEquals(expected, employee.toString());

    }
}