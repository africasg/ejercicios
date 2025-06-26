package ChainOfResponsability;

// Manejador concreto: Procesa peticiones de tipo "B"
public class HandlerB extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.equals("B")) {
            System.out.println("HandlerB procesó la solicitud.");
        } else {
            super.handle(request); // Pasar al siguiente manejador
        }
    }
}
