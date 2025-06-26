package FINAL.libros;

/**
 * Clase para libros de no ficción.
 */
public class LibroNoFiccion extends Libro {
    public LibroNoFiccion(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String getTipo() {
        return "No Ficción";
    }
}