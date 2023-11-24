import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Andres", "Paulina", "joel", "mauricio", "Maria");

        List<String> inicialMayuscula = nombres.stream()
                .filter(Principal2::isMayuscula)
                .collect(Collectors.toList());

        System.out.println(inicialMayuscula);
    }

    private static boolean isMayuscula(String s) {
        return s.toUpperCase().charAt(0) == s.charAt(0);
    }
}

