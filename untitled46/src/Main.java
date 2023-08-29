import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final int nEquipo = 6;
    static final String pokemonCSV = "pokemon.csv";
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemones = new ArrayList<>();
        generarPokemones(pokemones);
        Pokemon[] equipo1 = new Pokemon[nEquipo];
        llenarEquipo(equipo1, pokemones);
        mostrarEquipo(equipo1);

    }

    private static void generarPokemones(ArrayList<Pokemon> pokemones) {
        Path archivo = Paths.get(pokemonCSV);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
        } catch (Exception e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] pokemonesDATA = texto.split("\n");
        for (int i = 1; i < pokemonesDATA.length; i++) {
            pokemones.add(new Pokemon(pokemonesDATA[i]));
        }
        System.out.println("La cantidad de pokemones creados es: "+ pokemones.size());
    }

    private static void mostrarEquipo(Pokemon[] equipo) {
        for (Pokemon p: equipo) {
            System.out.println(p);
        }
        System.out.println("El total de equipo es: "+ equipo.length);
    }

    private static void llenarEquipo(Pokemon[] equipo, ArrayList<Pokemon> pokemones) {
        Random rnum = new Random();
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = pokemones.get(rnum.nextInt(pokemones.size()));
        }
    }
}