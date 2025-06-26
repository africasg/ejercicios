package FactoryMethod;

public class BotonWindows implements Boton {
    @Override
    public void render() {
        System.out.println("Renderizando un botón de Windows.");
    }

    @Override
    public void onClick() {
        System.out.println("Click en el botón de Windows.");
    }
}
