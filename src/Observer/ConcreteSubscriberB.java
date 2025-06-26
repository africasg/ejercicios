package Observer;

public class ConcreteSubscriberB implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Lector B recibió la noticia: " + news);
    }
}
