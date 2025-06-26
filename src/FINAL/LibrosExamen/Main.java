package FINAL.LibrosExamen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cargamos la instancia única de la Biblioteca
        Biblioteca biblioteca = Biblioteca.getInstancia();

        // Primero, intentamos cargar desde archivo si existe
        GestorArchivo.cargarBiblioteca(biblioteca);

        // Si la biblioteca está vacía, agregamos algunos libros de ejemplo
        if (biblioteca.getLibros().isEmpty()) {
            Libro libro1 = new LibroCiencia("Breve historia del tiempo", "Stephen Hawking", true);
            Libro libro2 = new LibroHistoria("Sapiens", "Yuval Noah Harari", false);
            Libro libro3 = new LibroCiencia("El gen egoísta", "Richard Dawkins", true);

            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);
            biblioteca.agregarLibro(libro3);

            // Guardamos después de agregar
            GestorArchivo.guardarBiblioteca(biblioteca);
        }

        // Comenzamos a interactuar por consola con el usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Consultar disponibilidad de un libro");
            System.out.println("3. Guardar biblioteca");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }

            switch (opcion) {
                case 1:
                    mostrarLibros(biblioteca);
                    break;
                case 2:
                    consultarLibro(biblioteca, scanner);
                    break;
                case 3:
                    GestorArchivo.guardarBiblioteca(biblioteca);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarLibros(Biblioteca biblioteca) {
        System.out.println("\n--- Lista de Libros ---");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(
                    "Título: " + libro.getTitulo() +
                            " | Autor: " + libro.getAutor() +
                            " | Categoría: " + libro.getCategoria() +
                            " | Disponible: " + (libro.isDisponible() ? "Sí" : "No")
            );
        }
    }

    private static void consultarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("\nIngresa el título del libro a consultar: ");
        String titulo = scanner.nextLine();
        Libro libro = biblioteca.buscarLibroPorTitulo(titulo);

        if (libro != null) {
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Categoría: " + libro.getCategoria());
            System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
        } else {
            System.out.println("El libro con título '" + titulo + "' no se encontró en la biblioteca.");
        }
    }
}
