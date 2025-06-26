package FINAL.estudiantes;

public class EstudiantePosgrado extends Estudiante {
    public EstudiantePosgrado(String nombre, int edad, String matricula) {
        super(nombre, edad, matricula);
    }

    @Override
    public String getTipo() {
        return "Posgrado";
    }
}
