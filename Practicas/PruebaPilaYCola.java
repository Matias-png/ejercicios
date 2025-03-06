package Practicas;

public class PruebaPilaYCola {

    void testListaPilaYCola() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("Elemento eliminado de la pila: " + pila.pop()); // Debería imprimir 3

        // Ejemplo de uso de Cola
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        System.out.println("Elemento eliminado de la cola: " + cola.dequeue());
    }


    }



