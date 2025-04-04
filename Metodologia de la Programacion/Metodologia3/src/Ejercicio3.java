import com.google.gson.Gson;

class PersonaArray {
    String[] nombres;

    public PersonaArray(String[] nombres) {
        this.nombres = nombres;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String[] nombres = {"Carlos", "Lucía", "Pedro"};
        PersonaArray personaArray = new PersonaArray(nombres);

        String json = gson.toJson(personaArray);
        System.out.println(json);
    }
}

