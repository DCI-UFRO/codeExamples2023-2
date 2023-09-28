// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Mario");
        Pokemon p = new Pokemon();
        entrenador1.addPokemon(p);
        System.out.println(entrenador1.getClass());

        Persona entrenador = new Entrenador("Julia");
        Persona lider = new Lider("");
        Persona enfermera = new Enfermera("");

        System.out.println(entrenador.getClass());
        System.out.println(lider.getClass());
        System.out.println(enfermera.getClass());

        batalla((Entrenador) entrenador, (Entrenador)lider);
    }

    private static void batalla(Entrenador entrenador, Entrenador lider) {
        System.out.println(entrenador.getClass());
        System.out.println(lider.getClass());
    }
}