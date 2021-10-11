/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Creamos un objeto Scanner que tomará los valores ingresados por consola. 
		Scanner scan = new Scanner(System.in);
	        System.out.println("\nIntroduzca un numero entero para el cálculo de factorial: ");
	        Integer numero = scan.nextInt();
	        
	        System.out.println("\nEl factorial de "+ numero + " es: " + factorial(numero));
	        scan.close();

	}
	
	public static int factorial(int num){
    
        if (num == 0){
          return 1;
        }else{
          return num * (factorial(num-1));
        }
    }
}
    