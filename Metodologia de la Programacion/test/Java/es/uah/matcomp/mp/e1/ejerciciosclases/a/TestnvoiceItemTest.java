package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestnvoiceItemTest {
    private InvoiceItem invoiceItem;

    @BeforeEach
    void setUp() {
        invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);

    }

    @AfterEach
    void tearDown() {
        invoiceItem = null;

    }

    @Test
    void getId() {
        assertEquals("A101", invoiceItem.getId(), "El ID debe ser 'A101'");
    }

    @Test
    void getDesc() {
        assertEquals("Pen Red", invoiceItem.getDesc(), "La descripción debe ser 'Pen Red'");
    }

    @Test
    void getQty() {
        assertEquals(888, invoiceItem.getQty(), "La cantidad debe ser 888");
    }

    @Test
    void setQty() {
        invoiceItem.setQty(999);
        assertEquals(999, invoiceItem.getQty(), "La cantidad debe ser 999");
    }

    @Test
    void getUnitPrice() {
        assertEquals(0.08, invoiceItem.getUnitPrice(), "El precio unitario debe ser 0.08");
    }

    @Test
    void setUnitPrice() {
        invoiceItem.setUnitPrice(0.99);
        assertEquals(0.99, invoiceItem.getUnitPrice(), "El precio unitario debe ser 0.99");

    }

    @Test
    void getTotal() {
        assertEquals(71.04, invoiceItem.getTotal(), "El total debe ser 71.04");
        invoiceItem.setQty(10);
        invoiceItem.setUnitPrice(1.50);
        assertEquals(15.00, invoiceItem.getTotal(), "El total debe ser 15.00");

    }

    @Test
    void testToString() {
        String expected = "InvoiceItem[id=A101, description=Pen Red, qty=888, unitPrice=0.08]";
        assertEquals(expected, invoiceItem.toString(), "El valor de toString() debe ser 'InvoiceItem[id=A101, description=Pen Red, qty=888, unitPrice=0.08]'");

    }
}