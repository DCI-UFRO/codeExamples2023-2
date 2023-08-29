public class Pokemon {
    private int numero;
    private String name;
    private String type_1;
    private String type_2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int attackSP;
    private int defenseSP;
    private int speed;
    private int generation;
    private boolean lengendary;

    public Pokemon(String datos) {
        //453,Croagunk,Poison,Fighting,300,48,61,40,61,40,50,4,False

        this.numero = numero;
        this.name = name;
        this.type_1 = type_1;
        this.type_2 = type_2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.attackSP = attackSP;
        this.defenseSP = defenseSP;
        this.speed = speed;
        this.generation = generation;
        this.lengendary = lengendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", name='" + name + '\'' +
                ", type_1='" + type_1 + '\'' +
                ", type_2='" + type_2 + '\'' +
                ", total=" + total +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", attackSP=" + attackSP +
                ", defenseSP=" + defenseSP +
                ", speed=" + speed +
                ", generation=" + generation +
                ", lengendary=" + lengendary +
                '}';
    }
}
