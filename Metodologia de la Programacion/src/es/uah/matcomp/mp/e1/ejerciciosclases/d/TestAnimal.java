package es.uah.matcomp.mp.e1.ejerciciosclases.d;

public class TestAnimal {
    public static void main(String[] args) {
        Cat c1 = new Cat("AAA");
        c1.greets();
        Dog d1 = new Dog("BBB");
        d1.greets();
        d1.greets(d1);
        BigDog bd1 = new BigDog("CCC");
        bd1.greets();
        bd1.greets(d1);
        bd1.greets(bd1);

    }
}
