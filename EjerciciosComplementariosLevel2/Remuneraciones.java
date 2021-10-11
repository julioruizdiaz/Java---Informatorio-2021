/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
*/

import java.util.*;

public class Remuneraciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dias = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        ArrayList<Integer> valorHora = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i]);
            System.out.print("Ingrese cantidad de horas trabajadas: ");
            horasTrabajadas.add(scan.nextInt());

            System.out.print("Ingrese el valor por hora de la jornada: ");
            valorHora.add(scan.nextInt());
            System.out.println("");
        }
        System.out.println("Los totales diarios a cobrar son:");

        ArrayList<Integer> valorJornada = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            valorJornada.add(horasTrabajadas.get(i) * valorHora.get(i));
        }
        System.out.println("");

        int valorSemana = 0;

        for (int i = 0; i < 5; i++) {
            valorSemana += valorJornada.get(i);
            System.out.println(dias[i] + ": $ " + valorJornada.get(i));
        }
        System.out.println("");

        System.out.print("El total semanal a cobrar es: $" + valorSemana);
        scan.close();
    }
}
