package Excepciones7;

public class Excepciones7 {
    public static void Prueba(int n) {
        //ArrayIndexOutOfBoundsException
        if (n == 1){
            int[] anArray = new int[3];
            System.out.println(anArray[3]);
        }
        //NullPointerException
        if (n == 2) {
            String[] strs = new String[3];
            System.out.println(strs[0].length());
        }
        //NumberFormatException
        if (n == 3) {
            Integer.parseInt("abc");
        }
        //ClassCastException
        if (n == 4) {
            Object o = new Object();
            Integer i = (Integer)o;
        }
        //IllegalArgumentException
        if (n == 5) {
            throw new IllegalArgumentException("el numero no puede ser 5");
        }
    }
}
