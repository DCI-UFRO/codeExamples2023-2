import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemones = new ArrayList<>();
        pokemones.add(new Pokemon("pikachu"));
        pokemones.add(new Pokemon("magikarp"));
        pokemones.add(new Pokemon("charmander"));
        pokemones.add(new Pokemon("bulbasaur"));
        pokemones.add(new Pokemon("togepi"));
        pokemones.add(new Pokemon("vaporeon"));
        Entrenador e0 = new Entrenador("Carlos");
        e0.addPokemon(pokemones.get(0));
        e0.addPokemon(pokemones.get(1));
        e0.addPokemon(pokemones.get(2));
        Entrenador e1 = new Entrenador("Ignacio");
        e1.addPokemon(pokemones.get(3));
        e1.addPokemon(pokemones.get(4));
        e1.addPokemon(pokemones.get(5));


        int comparacion = e0.getEquipo().get(0).compareTo(pokemones.get(0));
        System.out.println(comparacion);

    }
}