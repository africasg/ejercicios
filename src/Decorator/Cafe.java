package Decorator;
// Implementación básica de una bebida concreta
public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double getCosto() {
        return 5.0; // Precio base del café
    }
}

