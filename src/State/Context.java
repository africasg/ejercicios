package State;

public class Context {
    private State state; // Referencia al estado actual

    public Context(State initialState) {
        this.state = initialState;
        this.state.setContext(this); // Asociar el contexto con el estado
    }

    // Cambiar el estado actual
    public void changeState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    // Delegar las operaciones al estado actual
    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }
}
