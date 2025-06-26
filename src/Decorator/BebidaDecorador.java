package Decorator;

// Clase base para los decoradores
public abstract class BebidaDecorador implements Bebida {
    protected Bebida bebida; // Referencia al objeto que se está decorando

    public BebidaDecorador(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}
