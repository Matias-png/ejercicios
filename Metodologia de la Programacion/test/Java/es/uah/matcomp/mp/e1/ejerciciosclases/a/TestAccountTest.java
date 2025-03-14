package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class TestAccountTest {
    private Account account1;
    private Account account2;


    @BeforeEach
    void setUp() {
        account1 = new Account("123", "John Doe", 1000);
        account2 = new Account("456", "Jane Doe", 500);
    }

    @AfterEach
    void tearDown() {
        account1 = null;
        account2 = null;
    }

    @org.junit.jupiter.api.Test
    void testCredit() {
        account1.credit(500);
        assertEquals(1500, account1.getBalance(), "El saldo de la cuenta debe ser 1500 después de acreditar 500");
    }
    @org.junit.jupiter.api.Test
    void testDebit() {
        account1.debit(300);
        assertEquals(700, account1.getBalance(), "El saldo de la cuenta debe ser 700 después de debitar 300");
    }

    @org.junit.jupiter.api.Test
    void testDebitInsufficientBalance() {
        account1.debit(1200);  // Intentamos retirar más de lo que tiene
        assertEquals(1000, account1.getBalance(), "El saldo debe seguir siendo 1000 después de un intento fallido de débito");
    }
    @org.junit.jupiter.api.Test
    void testTransferTo() {
        account1.transferTo(account2, 300);
        assertEquals(700, account1.getBalance(), "El saldo de la cuenta 1 debe ser 700 después de transferir 300");
        assertEquals(800, account2.getBalance(), "El saldo de la cuenta 2 debe ser 800 después de recibir 300");
    }
    @org.junit.jupiter.api.Test
    void testTransferToInsufficientFunds() {
        account1.transferTo(account2, 1200);  // Intentamos transferir más de lo que tiene
        assertEquals(1000, account1.getBalance(), "El saldo de la cuenta 1 debe seguir siendo 1000 después de una transferencia fallida");
    }
    @org.junit.jupiter.api.Test
    void testGetId() {
        assertEquals("123", account1.getId(), "El ID de la cuenta debe ser '123'");
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        assertEquals("John Doe", account1.getName(), "El nombre de la cuenta debe ser 'John Doe'");
    }
    @org.junit.jupiter.api.Test
    void testGetBalance() {
        assertEquals(1000, account1.getBalance(), "El saldo inicial de la cuenta debe ser 1000");
    }
    @org.junit.jupiter.api.Test
    void testAccountCreation() {
        Account newAccount = new Account("789", "Alice", 200);
        assertEquals(200, newAccount.getBalance(), "El saldo de la nueva cuenta debe ser 200");
    }
    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Account [id=123, name=John Doe, balance=1000]";
        assertEquals(expected, account1.toString(), "El resultado de toString() debe coincidir con la representación esperada");
    }

}