public abstract class Persona {
    private String nombre;
    private int edad;
    protected String ciudad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract void setCiudad(String ciudad);

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}

