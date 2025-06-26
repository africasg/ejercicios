package Decorator;

// Decorador para añadir crema
public class Crema extends BebidaDecorador {
    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1.0; // Costo adicional por crema
    }
}
