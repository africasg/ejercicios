package FactoryMethod;

public class BotonMacOS implements Boton {
    @Override
    public void render() {
        System.out.println("Renderizando un botón de MacOS.");
    }

    @Override
    public void onClick() {
        System.out.println("Click en el botón de MacOS.");
    }
}
