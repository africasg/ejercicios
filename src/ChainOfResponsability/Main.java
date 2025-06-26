package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        // Crear los manejadores concretos
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        // Configurar la cadena: A -> B -> C
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        // Cliente envía peticiones
        System.out.println("Enviando petición A:");
        handlerA.handle("A"); // HandlerA procesará la solicitud

        System.out.println("\nEnviando petición B:");
        handlerA.handle("B"); // HandlerB procesará la solicitud

        System.out.println("\nEnviando petición C:");
        handlerA.handle("C"); // HandlerC procesará la solicitud

        System.out.println("\nEnviando petición D:");
        handlerA.handle("D"); // Ningún manejador puede procesar
    }
}
