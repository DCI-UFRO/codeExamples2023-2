public class Entrenador extends Persona implements Mostrable{
    @Override
    public void mostrarDatos() {
        //
    }

    public Entrenador(String nombre) {
        super(nombre);
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
