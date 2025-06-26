package FINAL.LibrosExamen;

public class LibroHistoria extends Libro {
    private static final long serialVersionUID = 1L;

    public LibroHistoria(String titulo, String autor, boolean disponible) {
        super(titulo, autor, disponible);
    }

    @Override
    public String getCategoria() {
        return "Historia";
    }
}
