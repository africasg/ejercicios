package FINAL.libros;

/**
 * Clase abstracta que representa un libro en la biblioteca.
 */
public abstract class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    /**
     * Método abstracto para describir el tipo de libro.
     *
     * @return una descripción del tipo de libro.
     */
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + ": " + titulo + " por " + autor;
    }
}