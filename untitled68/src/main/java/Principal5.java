import java.util.stream.Stream;

public class Principal5 {
    public static void main(String[] args) {
        int suma = Stream.of(2, 6, 3, 4,9,6)
                //.peek(e-> System.out.print(e))
                .filter(e -> e%2==0)
                .map(e->e+1)
                .peek(System.out::println)
                .reduce(0,Integer::sum);
        System.out.println(suma);
    }
}
