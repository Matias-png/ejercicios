import com.google.gson.Gson;

class Direccion {
    String calle;
    String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }
}

class PersonaConDireccion {
    String nombre;
    Direccion direccion;

    public PersonaConDireccion(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        PersonaConDireccion persona = new PersonaConDireccion("Laura", new Direccion("Calle Falsa 123", "Madrid"));

        String json = gson.toJson(persona);
        System.out.println(json);
    }
}

