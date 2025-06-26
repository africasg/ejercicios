package TemplateMethod;
//El algoritmo general esté definido en una clase base (abstracta).
//Las subclases concreten pasos específicos del algoritmo.
public class Main {
    public static void main(String[] args) {
        // Preparar té
        System.out.println("Preparando té:");
        Beverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println("\nPreparando café:");
        // Preparar café
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}

