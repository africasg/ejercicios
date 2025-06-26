package State;
//El patrón State es un patrón de comportamiento que permite que un objeto cambie su comportamiento dependiendo de su estado interno, sin usar estructuras condicionales (if-else o switch). La idea principal es delegar el comportamiento a diferentes clases que representan los estados.
public class Main {
    public static void main(String[] args) {
        // Crear el estado inicial
        State initialState = new ConcreteStateA();

        // Crear el contexto con el estado inicial
        Context context = new Context(initialState);

        // Ejecutar operaciones
        System.out.println("Primera operación:");
        context.doThis(); // Ejecuta doThis en Estado A y cambia a Estado B

        System.out.println("\nSegunda operación:");
        context.doThat(); // Ejecuta doThat en Estado B y cambia a Estado A

        System.out.println("\nTercera operación:");
        context.doThis(); // Ejecuta doThis en Estado A y cambia a Estado B
    }
}
