package Decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        // Crear un café básico
        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescripcion() + " -> $" + bebida.getCosto());

        // Añadir leche al café
        bebida = new Leche(bebida);
        System.out.println(bebida.getDescripcion() + " -> $" + bebida.getCosto());

        // Añadir chocolate al café con leche
        bebida = new Chocolate(bebida);
        System.out.println(bebida.getDescripcion() + " -> $" + bebida.getCosto());

        // Añadir crema al café con leche y chocolate
        bebida = new Crema(bebida);
        System.out.println(bebida.getDescripcion() + " -> $" + bebida.getCosto());
    }
}
