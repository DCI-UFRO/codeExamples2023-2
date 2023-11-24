import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private ArrayList<Integer> numeros;
    private ArrayList<Animal> mascotas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeros = new ArrayList<>();
        this.mascotas = new ArrayList<>();
    }
    public void addNumero(int numero){
        this.numeros.add(numero);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeros=" + numeros +
                ", mascotas=" + mascotas +
                '}';
    }

    public void addMascota(Animal mascota) {
        mascotas.add(mascota);
    }
}
