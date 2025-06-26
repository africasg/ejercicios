package clases;
import java.io.IOException;
import java.util.logging.*;
public class Clase20_11 {


    public class LoggerEjemplo {
        public static void main(String[] args) throws IOException{
                    // Crear un Logger
                    Logger logger = Logger.getLogger(LoggerEjemplo.class.getName());
                    logger.setLevel(Level.ALL); // Establece el nivel de log global (para todos los handlers)
                    logger.setUseParentHandlers(false);

                    // Crear un handler para la consola
                    ConsoleHandler consoleHandler = new ConsoleHandler();
                    consoleHandler.setLevel(Level.WARNING); // Muestra todos los niveles en la consola

                   FileHandler fileHandler = new FileHandler();
                   fileHandler.setLevel(Level.ALL);
                   fileHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(consoleHandler);
            logger.addHandler(fileHandler);


                    // Ejemplo de logs
                    logger.severe("Este es un mensaje de error (severe).");
                    logger.warning("Este es un mensaje de advertencia (warning).");
                    logger.info("Este es un mensaje informativo (info).");
                    logger.fine("Este es un mensaje de depuración (fine).");
                    logger.finest("Este es un mensaje detallado (finest).");
                }
            }
}
