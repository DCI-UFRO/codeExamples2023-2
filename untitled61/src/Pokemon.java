public class Pokemon implements Comparable<Pokemon> {
    private String nombre;
    private int hp;
    private int ataque;

    public Pokemon(String nombre, int hp, int ataque) {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", hp=" + hp +
                ", ataque=" + ataque +
                '}';
    }

    @Override
    public int compareTo(Pokemon pokemon) {
        return this.hp-pokemon.hp;
    }
}
