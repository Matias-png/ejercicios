package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {
    private Customer customer;
    private Invoice invoice;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "Alice", 10);
        invoice = new Invoice(1001, customer, 200.0);
    }

    @AfterEach
    void tearDown() {
        customer = null;
        invoice = null;
    }

    @Test
    void getId() {
        assertEquals(1001, invoice.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer newCustomer = new Customer(2, "Bob", 5);
        invoice.setCustomer(newCustomer);
        assertEquals(newCustomer, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(200.0, invoice.getAmount());
    }

    @Test
    void setAmount() {
        invoice.setAmount(250.0);
        assertEquals(250.0, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("Alice", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(180.0, invoice.getAmountAfterDiscount());

        // Prueba con un cliente con un descuento diferente
        Customer newCustomer = new Customer(2, "Bob", 20);
        invoice.setCustomer(newCustomer);
        assertEquals(160.0, invoice.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        String expected = "Invoice [id= 1001, customer=Alice(1)(10%), amount=200.0]";
        assertEquals(expected, invoice.toString());
    }
}