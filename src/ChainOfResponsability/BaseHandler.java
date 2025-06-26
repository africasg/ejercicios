package ChainOfResponsability;

// Manejador Base
public abstract class BaseHandler implements Handler {
    protected Handler next; // Referencia al siguiente manejador en la cadena

    @Override
    public void setNext(Handler handler) {
        this.next = handler; // Establecer el próximo manejador
    }

    @Override
    public void handle(String request) {
        if (next != null) {
            next.handle(request); // Pasar la petición al siguiente manejador
        }
    }
}
