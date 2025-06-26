package FactoryMethod;

// Creador Concreto: Dialogo para Windows
public class DialogoWindows extends Dialogo {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }
}
