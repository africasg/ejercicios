package FactoryMethod;

public class Aplicacion {
    private static Dialogo dialogo;

    public static void main(String[] args) {
        configurar("MacOS");
        ejecutar();
    }

    // Configurar el diálogo según el sistema operativo
    private static void configurar(String sistema) {
        if (sistema.equals("Windows")) {
            dialogo = new DialogoWindows();
        } else if (sistema.equals("MacOS")) {
            dialogo = new DialogoMacOS();
        }
    }

    // Renderizar el diálogo
    private static void ejecutar() {
        dialogo.renderizarDialogo();
    }
}
