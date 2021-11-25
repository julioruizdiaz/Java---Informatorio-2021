import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;
        List<Integer> resultados = palabras.stream()
                                            .map(x-> Ejercicio2.calcularPotencia(x, potencia))
                                            .collect(Collectors.toList());
        System.out.println(resultados);
    }
    public static Integer calcularPotencia(Integer numero, Integer potencia) {
        if (potencia == 0){
            return 1;
        }else {
            return numero * calcularPotencia(numero, potencia-1);
        }
    }
}
