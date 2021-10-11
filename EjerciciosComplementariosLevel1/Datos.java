/*
Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

import java.util.*;

public class Datos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nIngrese Nombre y Apellido: ");
        String nombre = scan.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = Integer.parseInt(scan.nextLine());

        System.out.print("Ingrese Dirección: ");
        String direccion = scan.nextLine();

        System.out.print("Ingrese Ciudad: ");
        String ciudad = scan.nextLine();
        System.out.println("");
        System.out.println("Los datos ingresados son: ");
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
        scan.close();
    }
}
