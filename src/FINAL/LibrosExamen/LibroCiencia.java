package FINAL.LibrosExamen;

public class LibroCiencia extends Libro {
    private static final long serialVersionUID = 1L;

    public LibroCiencia(String titulo, String autor, boolean disponible) {
        super(titulo, autor, disponible);
    }

    @Override
    public String getCategoria() {
        return "Ciencia";
    }
}
