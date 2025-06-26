package FINAL.LibrosExamen;

import java.io.Serializable;

public abstract class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Método abstracto para identificar la categoría/clase del libro.
     * Se implementará en las subclases.
     */
    public abstract String getCategoria();
}
