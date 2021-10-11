/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.
*/

import java.util.*;

public class Operaciones {
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomará los valores ingresados por consola.
        Scanner scan = new Scanner(System.in);

        System.out.print("\nIngrese un numero entero: ");
        int a = scan.nextInt();

        System.out.print("Ingrese otro numero entero: ");
        int b = scan.nextInt();

        System.out.println("\nLos resultados de las operaciones con ambos números son: ");
        System.out.println(a + "+" + b + ": " + (a+b));
        System.out.println(a + "-" + b + ": " + (a-b));
        System.out.println(a + "*" + b + ": " + (a*b));
        System.out.println(a + "/" + b + ": " + (a/b));
        System.out.println(a + "%" + b + ": " + (a%b));
        scan.close();
    }
}
