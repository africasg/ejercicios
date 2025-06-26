package clases.basica.ejercicio05;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = scanner.nextLine();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("La palabra al reves es: "+Ejercicio3.cambiarOrden(palabra) ); //diferencia entre hacer lo de ejercicio 03 o sin ello
        System.out.println("La palabra sin vocales es: "+Ejercicio3.palabraSinVocales(palabra) );
        System.out.println("El numero de letras es: "+Ejercicio3.numLetras(palabra));

    }

    private static String cambiarOrden(String palabraintroducida) {
        String palabracambiada="";
            for(int i = palabraintroducida.length()-1; i > 0 ; i--){
                palabracambiada += palabraintroducida.charAt(i);
            }
        return palabracambiada;
    }
    private static int numLetras (String palabraintroducida){
        int numletras = 0;
        for(char letra: palabraintroducida.toCharArray()){ numletras++;}
        return numletras;
    }
    private static String palabraSinVocales(String palabraintroducida){
        String palabraSinVocales ="";
        String vocales="AEIOUaeiou";
            for(char letra:palabraintroducida.toCharArray()){
               if(! vocales.contains(String.valueOf(letra))){
                   palabraSinVocales += letra;
               }
            }
               return palabraSinVocales;

    }
}
