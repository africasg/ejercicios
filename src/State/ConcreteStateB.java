package State;

// Estado concreto: Estado B
public class ConcreteStateB implements State {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("Estado B: Ejecutando doThis.");
    }

    @Override
    public void doThat() {
        System.out.println("Estado B: Ejecutando doThat.");
        // Cambiar al estado A como ejemplo
        context.changeState(new ConcreteStateA());
    }
}

