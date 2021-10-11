/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.
*/

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nIngrese un string: ");
        String texto = scan.nextLine();

        System.out.print("\nIngrese la letra que desea buscar: ");
        char letra = scan.nextLine().charAt(0);

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i)) {
                contador++;
            }
        }

        System.out.println("\nCantidad de veces que aparece la letra: " + contador);
        scan.close();
    }
}
