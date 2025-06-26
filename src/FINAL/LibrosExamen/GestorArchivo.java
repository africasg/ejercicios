package FINAL.LibrosExamen;
import java.io.*;
import java.util.List;

public class GestorArchivo {
    private static final String NOMBRE_ARCHIVO = "biblioteca.dat";

    // Guardar (serializar) la biblioteca en un archivo
    public static void guardarBiblioteca(Biblioteca biblioteca) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(biblioteca.getLibros());
            System.out.println("Biblioteca guardada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la biblioteca: " + e.getMessage());
        }
    }

    // Cargar (deserializar) la biblioteca de un archivo
    @SuppressWarnings("unchecked")
    public static void cargarBiblioteca(Biblioteca biblioteca) {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No se encontró archivo de biblioteca. Se creará uno nuevo.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            // Leemos la lista de libros deserializada
            List<Libro> librosCargados = (List<Libro>) ois.readObject();

            // Vaciamos la lista actual y agregamos los deserializados
            biblioteca.getLibros().clear();
            biblioteca.getLibros().addAll(librosCargados);

            System.out.println("Biblioteca cargada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la biblioteca: " + e.getMessage());
        }
    }
}

