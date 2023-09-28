import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> nombres1 = Arrays.asList("Matias", "Nicolas");
        //nombres1.add("Luis");
        System.out.println(nombres1);
        System.out.println(nombres1.get(0));

        List<String> nombres = new ArrayList<>();
        nombres.add("Juana");
        nombres.add("Miguel");
        nombres.add("adfha");

        System.out.println(nombres);
    }
}