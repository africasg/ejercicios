package TemplateMethod;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Preparando el café...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Añadiendo leche al café...");
    }
}

