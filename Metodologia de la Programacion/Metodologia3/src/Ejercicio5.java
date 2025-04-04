import java.io.*;

class Usuario implements Serializable {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pedro", 28);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.ser"))) {
            out.writeObject(usuario);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.ser"))) {
            Usuario usuarioCargado = (Usuario) in.readObject();
            System.out.println("Usuario cargado: " + usuarioCargado.nombre + ", " + usuarioCargado.edad);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
