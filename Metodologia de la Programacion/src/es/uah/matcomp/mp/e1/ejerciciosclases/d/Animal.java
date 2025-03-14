package es.uah.matcomp.mp.e1.ejerciciosclases.d;

abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void greets();
}
