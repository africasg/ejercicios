package clases.SERIALIZATION;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Serializar {
    public static void main(String[] args) {
        String filePath = "persona.ser"; // Archivo de salida
        String nombre = "Juan";
        int edad = 30;

        // Crear una instancia de la clase Persona
        Persona persona = new Persona(nombre, edad);

        // Serializar el objeto
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(persona);
            System.out.println("Objeto serializado con éxito en " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

