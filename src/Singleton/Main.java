package Singleton;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("Iniciando la aplicación...");

        // Obtener otra referencia al Logger
        Logger logger2 = Logger.getInstance();
        logger2.log("Realizando una operación importante...");

        // Verificar que ambas referencias apuntan a la misma instancia
        System.out.println("¿logger1 y logger2 son la misma instancia? " + (logger1 == logger2));
    }
}

