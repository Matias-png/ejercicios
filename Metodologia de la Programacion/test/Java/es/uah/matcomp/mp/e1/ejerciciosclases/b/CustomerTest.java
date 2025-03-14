package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "Alice", 10);
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void getId() {
        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    void getDiscount() {
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        customer.setDiscount(15);
        assertEquals(15, customer.getDiscount());
    }

    @Test
    void testToString() {
        String expected = "Alice(1)(10%)";
        assertEquals(expected, customer.toString());
    }
}