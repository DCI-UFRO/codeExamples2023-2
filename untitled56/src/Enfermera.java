public class Enfermera extends Persona{
    public Enfermera(String nombre) {
        super(nombre);
    }

    @Override
    public void setCiudad(String ciudad) {
        if(super.ciudad.isBlank()){
            super.ciudad = ciudad;
        }else {
            System.out.println("No puede ser cambiada la ciudad de origen");
        }

    }
}
