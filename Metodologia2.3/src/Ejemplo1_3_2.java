class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Ejemplo1_3_2 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (CustomException ex) {
            System.out.println("Excepción personalizada atrapada: " + ex.getMessage());
        }
    }

    public static void methodA() throws CustomException {
        methodB();
    }

    public static void methodB() throws CustomException {
        methodC();
    }

    public static void methodC() throws CustomException {
        System.out.println("Entrando a methodC...");
        throw new CustomException("Algo salió mal en methodC");
    }
}

