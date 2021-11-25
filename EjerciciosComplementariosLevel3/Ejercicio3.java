import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long cantidad = palabras.stream()
                        .filter(x -> x.startsWith("B") || x.startsWith("b"))
                        .count();
        System.out.println(cantidad);
    }
}
