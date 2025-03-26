public class Ejemplo1_7 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        }
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Intento de acceder a un objeto nulo.");
        }
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido.");
        }

        // Manejo de ClassCastException
        try {
            Object obj = new Object();
            String str = (String) obj; // No se puede convertir
        } catch (ClassCastException e) {
            System.out.println("Error: Conversión de tipo inválida.");
        }

        // Manejo de IllegalArgumentException
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Edad no puede ser negativa.");
        }
    }
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa: " + age);
        }
        System.out.println("Edad válida: " + age);
    }
}
