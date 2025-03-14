package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John Doe", "789 College Ave", "Computer Science", 2, 15000.0); // Crea un objeto Student
    }

    @AfterEach
    void tearDown() {
        student = null; // Limpia la referencia al objeto Student
    }

    @Test
    void testConstructor() {
        assertEquals("John Doe", student.getName());
        assertEquals("789 College Ave", student.getAddress());
        assertEquals("Computer Science", student.getProgram());
        assertEquals(2, student.getYear());
        assertEquals(15000.0, student.getFee());
    }

    @Test
    void testGetProgram() {
        assertEquals("Computer Science", student.getProgram());
    }

    @Test
    void testSetProgram() {
        student.setProgram("Mathematics");
        assertEquals("Mathematics", student.getProgram());
    }

    @Test
    void testGetYear() {
        assertEquals(2, student.getYear());
    }

    @Test
    void testSetYear() {
        student.setYear(3);
        assertEquals(3, student.getYear());
    }

    @Test
    void testGetFee() {
        assertEquals(15000.0, student.getFee());
    }

    @Test
    void testSetFee() {
        student.setFee(16000.0);
        assertEquals(16000.0, student.getFee());
    }

    @Test
    void testToString() {
        String expected = "Student [program=Computer Science, year=2, fee=15000.0]";
        assertEquals(expected, student.toString());
    }
}