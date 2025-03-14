package es.uah.matcomp.mp.e1.ejerciciosclases.b.ej2ap5;

public class Customer {
    private final int id;
    private final String name;
    private final char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + id + ")";
    }


}
