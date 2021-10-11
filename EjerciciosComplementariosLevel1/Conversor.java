/*
Realizar un Programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().
*/

import java.util.*;

public class Conversor {
    public static void main(String[] args) {
        System.out.print("\nIngrese un string con caracteres en minúsculas: ");
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        char caracter;
        System.out.println("\nEl string con caracteres en mayúsculas es: ");
        for (int i = 0; i < entrada.length(); i++) {
            caracter = entrada.charAt(i);
            //Trabajamos con códigos de caracteres ASCII
            //Códigos ASCII minúsculas
            if (caracter >= 97 && caracter <= 122) {
                //Conversión a códigos ASCII mayúsculas
                caracter -= 32;
            }

            System.out.print(caracter);
        }
        scan.close();
    }
}
