package TemplateMethod;

public abstract class Beverage {
    // Método plantilla: Define el algoritmo
    public final void prepareBeverage() {
        boilWater();
        brew(); // Método que las subclases implementan
        pourInCup();
        addExtras(); // Método opcional que las subclases pueden sobrescribir
    }

    // Métodos comunes para todas las bebidas
    private void boilWater() {
        System.out.println("Hirviendo agua...");
    }

    private void pourInCup() {
        System.out.println("Vertiendo en la taza...");
    }

    // Métodos que las subclases deben implementar
    protected abstract void brew(); // Preparar la bebida (té o café)
    protected abstract void addExtras(); // Añadir extras (como leche o limón)
}
