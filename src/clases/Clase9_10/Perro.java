package clases.Clase9_10;

public class Perro extends Animal {

    static void tipoAnimal() { // enlace estático
        System.out.println("Perro");
    }
    @Override
    void sonido() { // enlace dinámico
        System.out.println("El perro ladra");
    }
}

