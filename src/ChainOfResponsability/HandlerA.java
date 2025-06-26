package ChainOfResponsability;

// Manejador concreto: Procesa peticiones de tipo "A"
public class HandlerA extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.equals("A")) {
            System.out.println("HandlerA procesó la solicitud.");
        } else {
            super.handle(request); // Pasar al siguiente manejador
        }
    }
}

