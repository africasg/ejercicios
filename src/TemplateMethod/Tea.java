package TemplateMethod;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Infusionando el té...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Añadiendo limón al té...");
    }
}
