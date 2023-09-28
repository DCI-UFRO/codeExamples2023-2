import java.util.ArrayList;

public class Entrenador extends Persona {
    private ArrayList<Pokemon> equipo;

    public Entrenador(String nombre) {
        super(nombre);
        this.equipo = new ArrayList<>();
    }

    @Override
    public void setCiudad(String ciudad) {
        super.ciudad = ciudad;
    }

    public void addPokemon(Pokemon pokemon){
        this.equipo.add(pokemon);
    }

}
