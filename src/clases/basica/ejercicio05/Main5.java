package clases.basica.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

    }


    private List<Integer> LaLista() {
        List<Integer> list = new ArrayList<>();
        Scanner num = new Scanner(System.in);

        System.out.println("Introduce un número entero. Si quieres finalizar el proceso introduce una 'x':");

        while (true) {
            if (num.hasNextInt()) {
                int numero = num.nextInt();
                list.add(numero);
            } else {
                String input = num.next();
                if (input.equalsIgnoreCase("x")) {
                    break;  // Exit the loop if the user inputs "x"
                } else {
                    System.out.println("Introduce un número entero válido o 'x' para finalizar.");
                }
            }
        }

        System.out.println("Números introducidos: " + list);
        return list;
    }
}
