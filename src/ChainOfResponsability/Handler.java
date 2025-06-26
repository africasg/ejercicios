package ChainOfResponsability;

// Interfaz de Manejador
public interface Handler {
    void setNext(Handler handler); // Establecer el próximo manejador
    void handle(String request);  // Manejar la petición
}

