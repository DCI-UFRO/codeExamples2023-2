import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Principal8 {
    public static void main(String[] args) {
        // Genera una lista de 100 numeros aleatorios.
        // entre 0-100
        //filtrar la lista anterior dejando
        // solo los numeros primos

        Random rnum = new Random();
        List<Integer> numeros = rnum.ints(0,100000)
                .limit(10000)
                .boxed()
                .filter(n->{
                    if (n <= 1)
                        return false;
                    for (int i = 2; i <= n / 2; i++)
                        if (n % i == 0)
                            return false;
                    return true;
                })
                .toList();

        System.out.println(numeros);
        // sumar los numeros resultantes




        //dejar todo en una linea

    }
}
