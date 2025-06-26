package clases.basica.ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
     Coche mini = new Coche();
     Scanner scanner = new Scanner(System.in);

        mini.setMatricula(mini.pedirMatricula());
        mini.setModelo(mini.pedirModelo());
        mini.setCaballos(mini.pedirCaballos());
        System.out.println("Coche creado: ");
        System.out.println("Matricula: " + mini.getMatricula());
        System.out.println("Modelo: " + mini.getModelo());
        System.out.println("Caballos: " + mini.getCaballos());

        scanner.close();
}
    static class Coche {
        private String matricula;
        private String modelo;
        private int caballos;


        public String pedirMatricula(){//se declara aqui?
            System.out.println("Introduzca la matricula");
            Scanner scanner= new Scanner(System.in); //esta bien declarado aquu?
            String matricula = scanner.nextLine();
            return matricula;
            }

        public String getMatricula() {
            return matricula;
        }
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String pedirModelo(){
            System.out.println("Introduzca el modelo");
            Scanner scanner= new Scanner(System.in);
            String modelo = scanner.nextLine();
            return modelo;
        }

        public int getCaballos() {
            return caballos;
        }

        public void setCaballos(int caballos) {
            this.caballos = caballos;
        }

        public int pedirCaballos(){
            System.out.println("Introduzca los caballos");
            Scanner scanner= new Scanner(System.in);
            int caballos = scanner.nextInt();
            return caballos;
        }
        }
    }




