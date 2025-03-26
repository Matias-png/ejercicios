public class Ejemplo1_3_1{
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException ex) {
            System.out.println("Excepción atrapada: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        System.out.println("Entrando a methodC...");
        throw new ArithmeticException("División por cero detectada");
    }
}

