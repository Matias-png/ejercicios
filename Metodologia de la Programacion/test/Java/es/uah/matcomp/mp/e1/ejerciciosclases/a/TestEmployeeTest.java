package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestEmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(1, "John", "Doe", 3000);  // Inicializa el empleado

    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void getId() {
        assertEquals(1, employee.getId(), "El ID debe ser 1");
    }

    @Test
    void getFirstName() {
        assertEquals("John", employee.getFirstName(), "El nombre debe ser 'John'");
    }

    @Test
    void getLastName() {
        assertEquals("Doe", employee.getLastName(), "El apellido debe ser 'Doe'");
    }

    @Test
    void getName() {
        assertEquals("John Doe", employee.getName(), "El nombre completo debe ser 'John Doe'");
    }

    @Test
    void getSalary() {
        assertEquals(3000, employee.getSalary(), "El salario debe ser 3000");
    }

    @Test
    void setSalary() {
        employee.setSalary(2000);
        assertEquals(2000, employee.getSalary(), "El salario debe ser 2000");

    }

    @Test
    void getAnnualSalary() {
        assertEquals(36000, employee.getAnnualSalary(), "El salario anual debe ser 36000");
    }

    @Test
    void raiseSalary() {
        int newSalary = employee.raiseSalary(10);
        assertEquals(3300, newSalary, "El nuevo salario debe ser 3300");
        assertEquals(3300, employee.getSalary(), "El salario del empleado debe ser 3300 después del aumento");
    }

    @Test
    void testToString() {
        String expected = "Employee[id=1, Name=John Doe, salary=3000]";
        assertEquals(expected, employee.toString(), "El valor de toString() debe ser 'Employee[id=1, Name=John Doe, salary=3000]'");

    }
}