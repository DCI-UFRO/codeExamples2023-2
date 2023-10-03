import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(3);
        numeros.add(34);
        System.out.println(numeros);

        int[] num = {2, 3, 4, 5, 6};
        List<Integer> numeros2 = Arrays.asList(2, 3, 4, 5, 6, 1);

        System.out.println(numeros2);
    }
}