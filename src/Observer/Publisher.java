package Observer;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>(); // Lista de suscriptores

    // Agregar un suscriptor
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Eliminar un suscriptor
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notificar a todos los suscriptores
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
