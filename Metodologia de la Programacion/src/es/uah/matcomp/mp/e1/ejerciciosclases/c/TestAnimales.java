package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class TestAnimales {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        System.out.println(animal);
        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal);
        Cat cat = new Cat("Cat");
        System.out.println(cat);
        cat.greets();
        Dog dog = new Dog("Dog");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog);
    }
}
