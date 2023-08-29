import clases.Animal;

import java.util.Scanner;

public class EjemploClases {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Animal a0 = new Animal("n", "p", 3);
        System.out.println(a0);
        a0.cumpleaños();
        System.out.println(a0);


    }
}
