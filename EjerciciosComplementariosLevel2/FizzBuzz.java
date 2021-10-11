/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
*/

import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {

  int num1, num2;
    Scanner scan = new Scanner(System.in);
    System.out.print("\nIngrese un numero: ");
    num1 = scan.nextInt();
    System.out.print("\bIngrese otro numero mayor al primero: ");
    while(true){
      num2 = scan.nextInt();
      if(num2 > num1) {
        break;
      }
      System.out.println("¡El número ingresado no puede ser menor al primero! Ingréselo nuevamente: ");
    }
    
    int diferencia = (num2 - num1);

    ArrayList<String> arreglo = new ArrayList<>();

    arreglo.add(String.valueOf(num1));
     

    for (int i = (num1 + 1); i <= num2; i++) {
      if ((i % 2 == 0) && (i % 3 == 0)) {
        arreglo.add("FizzBuzz");
      } else if (i % 3 == 0) {
        arreglo.add("Buzz");
      } else if (i % 2 == 0) {
        arreglo.add("Fizz");
      } else arreglo.add(String.valueOf(i));
      
      }

    for(int j = 0; j <diferencia; j++){
      System.out.print("\"" + arreglo.get(j) + "\" ");
    }
    scan.close();
  }
}

