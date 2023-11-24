import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Andres", "Paulina", "joel", "mauricio", "Maria");
        System.out.println(nombres);

        ArrayList<String> inicialMayuscula = new ArrayList<>();
        for (String n: nombres) {
            if(n.toUpperCase().charAt(0)==n.charAt(0)){
                inicialMayuscula.add(n);
            }
        }
        System.out.println(inicialMayuscula);

    }
}
