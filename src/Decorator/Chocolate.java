package Decorator;

// Decorador para añadir chocolate
public class Chocolate extends BebidaDecorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 2.0; // Costo adicional por chocolate
    }
}
