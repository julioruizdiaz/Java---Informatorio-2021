/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).
*/

import java.util.*;

public class Producto {
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomará los valores ingresados por consola.
        Scanner scan = new Scanner(System.in);

        System.out.print("\nIngrese el valor a multiplicar: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el multiplicador: ");
        int b = scan.nextInt();

        int producto = 0;
        for (int i = 0; i < b; i++) {
            producto += a;
        }

        System.out.println("\nEl resultado del producto de ambos números es: ");

        System.out.println(a + "*" + b + ": " + producto);
        //System.out.println(a + b + ": " + producto);
        scan.close();
    }
}
