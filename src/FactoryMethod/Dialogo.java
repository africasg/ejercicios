package FactoryMethod;

// Creador
public abstract class Dialogo {
    // Método abstracto (Factory Method)
    public abstract Boton crearBoton();

    // Lógica general que usa el producto
    public void renderizarDialogo() {
        // Usamos el método factory para crear el botón
        Boton boton = crearBoton();
        boton.render();
    }
}

