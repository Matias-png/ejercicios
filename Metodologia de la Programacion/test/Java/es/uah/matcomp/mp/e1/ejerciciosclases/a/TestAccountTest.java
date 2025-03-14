package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(1500, account1.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testDebit() {
        account1.debit(300);
        assertEquals(700, account1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testDebitInsufficientBalance() {
        account1.debit(1200);
        assertEquals(1000, account1.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testTransferTo() {
        account1.transferTo(account2, 300);
        assertEquals(700, account1.getBalance());
        assertEquals(800, account2.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testTransferToInsufficientFunds() {
        account1.transferTo(account2, 1200);
        assertEquals(1000, account1.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testGetId() {
        assertEquals("123", account1.getId());
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        assertEquals("John Doe", account1.getName());
    }
    @org.junit.jupiter.api.Test
    void testGetBalance() {
        assertEquals(1000, account1.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testAccountCreation() {
        Account newAccount = new Account("789", "Alice", 200);
        assertEquals(200, newAccount.getBalance());
    }
    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Account [id=123, name=John Doe, balance=1000]";
        assertEquals(expected, account1.toString());
    }

}