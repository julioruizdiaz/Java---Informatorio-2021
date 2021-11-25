import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumnos("Marge", "Bouvier", LocalDate.of(1990, 9, 9)),
                new Alumnos("Lisa", "Simpson", LocalDate.of(2010, 8, 8)),
                new Alumnos("Bart", "Simpson", LocalDate.of(2011, 7, 7)),
                new Alumnos("Maggie", "Simpson", LocalDate.of(2018, 6, 6)));
        Map<String, Integer> alumnosEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getNombre() + " " + p.getApellido()),
                                p -> Ejercicio5.getEdad(p.getAniversario())));
        System.out.println(alumnosEdades);
    }

    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}

