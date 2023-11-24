import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal3 {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Andres", "Paulina", "joel", "mauricio", "Maria");

        List<String> inicialMayuscula = nombres.stream()
                .filter((String s)->{
                    return s.toUpperCase().charAt(0)== s.charAt(0);
                })
                .collect(Collectors.toList());

        System.out.println(inicialMayuscula);
    }
}
