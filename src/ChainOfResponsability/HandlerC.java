package ChainOfResponsability;

// Manejador concreto: Procesa peticiones de tipo "C"
public class HandlerC extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.equals("C")) {
            System.out.println("HandlerC procesó la solicitud.");
        } else {
            super.handle(request); // Pasar al siguiente manejador
        }
    }
}
