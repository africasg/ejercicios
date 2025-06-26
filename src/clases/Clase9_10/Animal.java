package clases.Clase9_10;

    public class Animal {
        static void tipoAnimal() { // enlace estático (método estático)
            System.out.println("Animal general");
        }
        void sonido() { // enlace dinámico (sobreescrito)
            System.out.println("El animal hace un sonido");
        }
    }

