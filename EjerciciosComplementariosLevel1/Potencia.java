/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).
*/

import java.util.*;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese un numero entero: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el exponente: ");
        int b = scan.nextInt();

        int potencia = 1;
        for (int i = 1; i <= b ; i++) {
            potencia *= a;
        }

        System.out.println("\nEl resultado de la potencia de ambos números es: ");

        System.out.println(+ a + " elevado a " + b +  " = " + potencia);
        scan.close();
    }
}
