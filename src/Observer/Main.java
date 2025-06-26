package Observer;
//El patrón Observer es un patrón de comportamiento que establece una relación uno a muchos entre objetos. Esto significa que:
//
//Un objeto (Publisher o Subject) administra una lista de observadores (Subscribers).
//Cuando el objeto Publisher cambia su estado o ocurre un evento, notifica automáticamente a todos los observadores suscritos.
public class Main {
    public static void main(String[] args) {
        // Crear el Publisher (sitio de noticias)
        Publisher newsPublisher = new Publisher();

        // Crear suscriptores (lectores)
        Subscriber readerA = new ConcreteSubscriberA();
        Subscriber readerB = new ConcreteSubscriberB();

        // Suscribir los lectores al sitio de noticias
        newsPublisher.subscribe(readerA);
        newsPublisher.subscribe(readerB);

        // Publicar una noticia (notificar a los suscriptores)
        System.out.println("Publicando noticia...");
        newsPublisher.notifySubscribers("Nueva ley aprobada en el Congreso");

        // Quitar un suscriptor
        newsPublisher.unsubscribe(readerA);

        // Publicar otra noticia
        System.out.println("\nPublicando otra noticia...");
        newsPublisher.notifySubscribers("Nuevas fechas de vacunación anunciadas");
    }
}
