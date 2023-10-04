import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Pokemon[] equipo = new Pokemon[6];
        equipo[0] = new Pokemon("Butterfree", 30, 40);
        equipo[1] = new Pokemon("Pidgey", 10, 65);
        equipo[2] = new Pokemon("Nidoking", 43, 70);
        equipo[3] = null;
        equipo[4] = new Pokemon("Arcanine", 90, 30);
        equipo[5] = new Pokemon("Poliwag", 29, 50);

        int num = equipo[0].compareTo(equipo[1]);
        System.out.println(num);

        System.out.println(Arrays.toString(equipo));

        //sort
        Arrays.sort(equipo);


        System.out.println(Arrays.toString(equipo));

        Equipo equipo1 = new Equipo("e1");
        Equipo equipo2 = new Equipo("e2");
        equipo1.addPokemon(equipo[0]);
        batalla(equipo1,equipo2);


    }

    private static void batalla(Equipo equipo1, Equipo equipo2) {

    }
}
