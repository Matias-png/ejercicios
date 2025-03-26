class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
public class Ejemplo1_4 {
    public static void checkNumber(int number) throws MyCustomException {
        if (number < 0) {
            throw new MyCustomException("Número negativo no permitido: " + number);
        } else {
            System.out.println("Número aceptado: " + number);
        }
    }
    public static void main(String[] args) {
        try {
            checkNumber(10);  // No lanza excepción
            checkNumber(-5);  // Lanza la excepción
        } catch (MyCustomException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
