package Observer;

public class ConcreteSubscriberA implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Lector A recibió la noticia: " + news);
    }
}

