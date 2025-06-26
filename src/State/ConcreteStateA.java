package State;

// Estado concreto: Estado A
public class ConcreteStateA implements State {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("Estado A: Ejecutando doThis.");
        // Cambiar al estado B como ejemplo
        context.changeState(new ConcreteStateB());
    }

    @Override
    public void doThat() {
        System.out.println("Estado A: Ejecutando doThat.");
    }
}
