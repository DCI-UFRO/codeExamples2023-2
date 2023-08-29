package clases;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void cumpleaños(){
        this.edad++;
    }


    @Override
    public String toString() {
        return "clases.Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }
}
