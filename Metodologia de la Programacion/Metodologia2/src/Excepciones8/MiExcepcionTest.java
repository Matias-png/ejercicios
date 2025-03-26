package Excepciones8;

public class MiExcepcionTest {
    public static void magic(int number) throws MiExcepcion {
        if (number<0) {
            throw (new MiExcepcion("El numero debe ser mayor que 0"));
        }
        System.out.println("hello"); // skip if exception triggered
    }
    public static void main(String[] args) {
        try {
            magic(9); // does not trigger exception
            magic(-5); // trigger exception
        } catch (MiExcepcion ex) { // exception handler
            ex.printStackTrace();
        }
    }
}

