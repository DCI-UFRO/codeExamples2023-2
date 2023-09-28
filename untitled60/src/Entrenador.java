import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private List<Pokemon> equipo;
    private String nombre;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        equipo = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        if(equipo.size()<6){
            equipo.add(pokemon);
        }
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }
}
