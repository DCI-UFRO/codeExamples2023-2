import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PrincipalSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        Random rnum = new Random();
        while(numeros.size()<10){
            numeros.add(rnum.nextInt(12)+1);
        }
        System.out.println(numeros);
        numeros.add(13);
        numeros.add(10);
        System.out.println(numeros);
        numeros.stream().forEach();

    }
}
