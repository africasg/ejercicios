package Decorator;

// Decorador para añadir leche
public class Leche extends BebidaDecorador {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1.5; // Costo adicional por leche
    }
}
