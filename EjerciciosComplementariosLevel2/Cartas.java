/*
Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
*/

import java.util.*;

public class Cartas {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta " + (i + 1));
        }

        System.out.println("\nLista de cartas ordenadas:");
        for (String orden : cartas) {
            System.out.println(orden);
        }
        System.out.println("");

        Collections.reverse(cartas);
        System.out.println("Lista de cartas en orden inverso:");
        for (String orden : cartas) {
            System.out.println(orden);
        }
        System.out.println("");

        Collections.shuffle(cartas);
        System.out.println("Lista de cartas en orden aleatorio:");
        for (String orden : cartas) {
            System.out.println(orden);
        }
    }
}
