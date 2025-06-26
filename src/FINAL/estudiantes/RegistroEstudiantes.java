package FINAL.estudiantes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegistroEstudiantes {
    private static RegistroEstudiantes instancia;
    private List<Estudiante> estudiantes;

    private RegistroEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public static RegistroEstudiantes getInstance() {
        if (instancia == null) {
            instancia = new RegistroEstudiantes();
        }
        return instancia;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Estudiantes registrados:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.getTipo() + ": " +
                        estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Matrícula: " + estudiante.getMatricula());
            }
        }
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(estudiantes);
            System.out.println("Datos guardados en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDesdeArchivo(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            estudiantes = (List<Estudiante>) ois.readObject();
            System.out.println("Datos cargados desde el archivo: " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}
