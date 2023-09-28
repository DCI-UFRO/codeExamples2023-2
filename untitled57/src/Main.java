import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList
        Persona entrenador1 = new Entrenador("Joel");
        Persona lider1 = new Lider("Brook");
        System.out.println(entrenador1.getClass());
        System.out.println(lider1.getClass());
        batalla((Entrenador) entrenador1, (Entrenador) lider1);

    }

    private static void batalla(Entrenador entrenador1, Entrenador entrenador2) {
        System.out.println(entrenador1.getClass());
        System.out.println(entrenador2.getClass());
    }
}