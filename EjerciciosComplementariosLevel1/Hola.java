/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!
*/

import java.util.*;

 
public class Hola {
    public static void main(String[] args) {
        System.out.print("\nPor favor, ingrese su nombre: ");
        //Creamos un objeto Scanner que tomará los valores ingresados por consola.
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("Hola " + nombre + "!!!");
        scan.close();
    }
}
