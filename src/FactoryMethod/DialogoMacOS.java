package FactoryMethod;

// Creador Concreto: Dialogo para MacOS
public class DialogoMacOS extends Dialogo {
    @Override
    public Boton crearBoton() {
        return new BotonMacOS();
    }
}
