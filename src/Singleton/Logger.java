package Singleton;

public class Logger {
    // Instancia única del Singleton
    private static Logger instance;

    // Constructor privado para evitar instanciación directa
    private Logger() {
        System.out.println("Logger inicializado.");
    }

    // Método estático para obtener la instancia única
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Crear la instancia si no existe
        }
        return instance;
    }

    // Método para registrar un mensaje
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
