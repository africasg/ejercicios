package FINAL.libros;

/**
 * Clase para libros de ficción.
 */
public class LibroFiccion extends Libro {
    public LibroFiccion(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String getTipo() {
        return "Ficción";
    }
}