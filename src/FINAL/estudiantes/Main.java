package FINAL.estudiantes;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = RegistroEstudiantes.getInstance();

        // Registrar estudiantes
        registro.agregarEstudiante(new EstudianteGrado("Juan", 20, "G12345"));
        registro.agregarEstudiante(new EstudiantePosgrado("Ana", 25, "P67890"));

        System.out.println("Antes de guardar:");
        registro.mostrarEstudiantes();

        // Guardar en archivo
        String archivo = "estudiantes.dat";
        registro.guardarEnArchivo(archivo);

        // Limpiar registro para simular la carga
        RegistroEstudiantes registroNuevo = RegistroEstudiantes.getInstance();
        registroNuevo.cargarDesdeArchivo(archivo);

        System.out.println("\nDespués de cargar:");
        registroNuevo.mostrarEstudiantes();
    }
}
