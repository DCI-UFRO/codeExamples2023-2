public abstract class Persona {
    private String nombre;
    protected String ciudad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract void setCiudad(String ciudad);
}
