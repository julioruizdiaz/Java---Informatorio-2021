/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/

import java.util.*;

public class Cursos {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Emiliano Martínez");
        estudiantes.add("Juan Foyth");
        estudiantes.add("Lucas Martínez Quarta");
        estudiantes.add("Cristian Romero");
        estudiantes.add("Nicolás Tagliafico");
        estudiantes.add("Rodrigo De Paul");
        estudiantes.add("Leandro Paredes");
        estudiantes.add("Lucas Ocampos");
        estudiantes.add("Lionel Messi");
        estudiantes.add("Lautaro Martínez");
        estudiantes.add("Ángel Di María");
        estudiantes.add("Lionel Scaloni ");

        List<String> curso1 = estudiantes.subList(0,4);
        List<String> curso2 = estudiantes.subList(4,8);
        List<String> curso3 = estudiantes.subList(8, estudiantes.size());

        System.out.println("\nAlumnos del primer curso:");
        for (String curso : curso1) {
            System.out.println(curso);
        }
        System.out.println("");
        
        System.out.println("Alumnos del segundo curso:");
        for (String curso : curso2) {
            System.out.println(curso);
        }
        System.out.println("");

        System.out.println("Alumnos del tercer curso:");
        for (String curso : curso3) {
            System.out.println(curso);
        }
    }
}
