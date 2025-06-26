package clases.basica.ejercicio_04;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero double");
        Scanner num = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        while (true) {
            double numerin = num.nextDouble();
            if (numerin <= 0) {
                System.out.println("El número es menor o igual a 0. Saliendo...");
                break;
            }

            numeros.add(numerin);
        }

        System.out.println("Los números ingresados son:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        double result = 0;
        for (double numero : numeros) {
            result = result + numero;
        }
        System.out.println("La suma es: " + result);
        num.close();
    }
}