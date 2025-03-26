public class Ejemplo1_2_1 {
    public static void main(String[] args) {
        System.out.println("Entrando en main()");
        methodA();
        System.out.println("Saliendo de main()");
    }

    public static void methodA() {
        System.out.println("Entrando en methodA()");
        methodB();
        System.out.println("Saliendo de methodA()");
    }

    public static void methodB() {
        System.out.println("Entrando en methodB()");
        methodC();
        System.out.println("Saliendo de methodB()");
    }

    public static void methodC() {
        System.out.println("Entrando en methodC()");
        System.out.println("Saliendo de methodC()");
    }
}

