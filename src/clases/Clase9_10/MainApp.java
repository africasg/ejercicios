package clases.Clase9_10;

public class MainApp {
        public static void main(String[] args) {
            Animal miAnimal = new Perro();
// Enlace estático - Llama al método de Animal
            miAnimal.tipoAnimal();
// Enlace dinámico - Llama al método de Perro
            miAnimal.sonido();
        }
    }

