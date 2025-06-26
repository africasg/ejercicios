package FINAL.LibrosExamen;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Única instancia de la clase (Singleton)
    private static Biblioteca instancia;

    // Lista de libros
    private List<Libro> libros;

    // Constructor privado para evitar instanciaciones externas
    private Biblioteca() {
        libros = new ArrayList<>();
    }

    // Punto de acceso global a la instancia
    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    // Métodos para manejar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por título en la lista y lo retorna.
     * @param titulo Título del libro.
     * @return El libro encontrado o null si no existe.
     */
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
