package FINAL.estudiantes;

public class EstudianteGrado extends Estudiante {
    public EstudianteGrado(String nombre, int edad, String matricula) {
        super(nombre, edad, matricula);
    }

    @Override
    public String getTipo() {
        return "Grado";
    }
}

