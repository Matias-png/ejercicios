package es.uah.matcomp.mp.e1.ejerciciosclases.b.ej2ap5;

public class TestAccountCustomer {
    public static void main(String[] args) {

        Customer c1 = new Customer(123, "Pepe", 'm'); //Prueba constructor customer
        System.out.println(c1); //Prueba toString Customer
        System.out.println("id is: " + c1.getId()); //Prueba getId
        System.out.println("name is: " + c1.getName()); //Prueba getName
        System.out.println("gender is: " + c1.getGender()); //Prueba getGender
        Account a1 = new Account(321, c1, 3000); //Prueba constructor account
        System.out.println(a1); //Prueba toString reutilizando toSting de Customer
        a1.setBalance(3000); //Prueba setBalance
        System.out.println(a1);
        System.out.println("id is: " + a1.getId()); //Prueba getId
        System.out.println("Customer is: " + a1.getCustomer()); //Prueba getCustomer
        System.out.println("balance is: " + a1.getBalance()); //Prueba getBalance
        System.out.println("Customer name is: " + a1.getCustomerName()); //Prueba getCustomerName
        a1.deposit(100); //Prueba deposit
        System.out.println(a1);
        a1.withdraw(2000); //Prueba withdraw (if)
        System.out.println(a1);
        a1.withdraw(2000); //Prueba withdraw (else)
        System.out.println(a1);
    }
}
