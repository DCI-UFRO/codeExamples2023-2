import java.util.Arrays;
import java.util.List;

public class Pincipal7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 1, 2, 3, 4);

        numeros.stream().forEach(System.out::println);

    }
}
