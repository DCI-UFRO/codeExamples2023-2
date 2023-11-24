import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal1 {
    public static void main(String[] args) {
        // crear una Lista de 10 numeros aleatorios
        // entre 1 y 12 que no se repitan
        Random rnum = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = rnum.nextInt(12)+1;
            while(numeros.contains(num)){
                num = rnum.nextInt(12)+1;
            }
            numeros.add(num);
        }
        System.out.println(numeros);
    }
}
