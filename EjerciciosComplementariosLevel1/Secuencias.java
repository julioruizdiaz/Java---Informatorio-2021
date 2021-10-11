/*
Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:
Entrada: 
5
Salida:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.*;

public class Secuencias {
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomará los valores ingresados por consola.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese un numero: ");
        int n = scan.nextInt();

        System.out.println("\nLa secuencia incremental del numero " + n + " es: ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        scan.close();

    }
}
