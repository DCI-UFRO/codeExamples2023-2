public class Pokemon implements Comparable<Pokemon>{
    private String nombre;
    private String tipo;
    private int hp;
    private int ataque;
    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.ataque=0;
        this.hp = 0;
        this.tipo = "";
    }

    @Override
    public int compareTo(Pokemon pokemon) {
        return this.hp+this.ataque - (pokemon.hp+ pokemon.ataque);
    }
}
