/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).
*/

import java.util.*;

public class Enteros {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();

        System.out.println("\nCreamos una lista de 5 números:");

        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);

        System.out.println("Elementos de la lista:");
        
        for (int i : enteros) {
            System.out.println(i);
        }

        System.out.println("La lista tiene " + enteros.size() + " elementos");

        enteros.add(0, 1);
        enteros.add(7);

        System.out.println("");
        System.out.println("Elementos de la lista modificada:");
        
        for (int i : enteros) {
            System.out.println(i);
        }
        System.out.println("La lista tiene " + enteros.size() + " elementos");
    }
}
