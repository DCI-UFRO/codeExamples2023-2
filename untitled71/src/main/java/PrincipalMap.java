import java.util.HashMap;
import java.util.Map;

public class PrincipalMap {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("12342-5", "Pedro");
        personas.put("12345-5", "Alonso");
        personas.put("12341-5", "Javier");
        personas.put("12341-5", "Pamela");

        System.out.println(personas);


    }
}
