/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking.
*/

import java.util.*;

public class Ciudades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudadesFavoritas = new ArrayList<>();

        boolean ejecutar = true;
        System.out.println("\nPor favor, ingrese sus ciudades favoritas de Argentina. ");
        do {
            System.out.print("\n¿Quiere agregar una ciudad? [s/n]: ");
            switch (scan.nextLine().charAt(0)) {
                case 's' :
                    System.out.print("¿Cuál es la ciudad?: ");
                    ciudadesFavoritas.add(scan.nextLine());
                    break;
                case 'S' :
                    System.out.print("¿Cuál es la ciudad?: ");
                    ciudadesFavoritas.add(scan.nextLine());
                    break;    
                case 'n':
                    ejecutar = false;
                    break;
                case 'N':
                    ejecutar = false;
                    break;                  
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
                    break;
            }
        } while (ejecutar);

        System.out.println("\nSus ciudades favoritas son: ");
        for (int i = 0; i < ciudadesFavoritas.size(); i++) {
            System.out.println("#" + (i+1) + " - " + ciudadesFavoritas.get(i));
        }
        scan.close();
    }
}
