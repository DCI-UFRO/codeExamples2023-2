public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
