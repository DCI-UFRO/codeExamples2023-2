public class Equipo {
    private String nombre;
    private Pokemon[] equipo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.equipo = new Pokemon[6];
    }

    public Equipo(String nombre, Pokemon[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public boolean checkTeam(){

        return false;
    }

    public void addPokemon(Pokemon pokemon){

    }
    public void changePokemon(Pokemon pokemon){

    }
}
