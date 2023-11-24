import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Principal6 {
    public static void main(String[] args) {
        // Genera una lista de 100 numeros aleatorios.





        // entre 0-100


        //filtrar la lista anterior dejando
        // solo con los numeros primos

        Math.random();
        Random rnum = new Random();
        List<Integer> numerosPrimos = rnum.ints(0,1000000)
                .limit(1000)
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
        System.out.println(numerosPrimos);

        //sumar todos los numeros de la lista
        long suma = numerosPrimos.stream()
                .reduce(0,Integer::sum);
        System.out.println(suma);
    }
}
