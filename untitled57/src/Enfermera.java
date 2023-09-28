public class Enfermera extends Persona{
    public Enfermera(String nombre) {
        super(nombre);
    }

    @Override
    public void setCiudad(String ciudad) {
        if(this.ciudad.isBlank()){
            this.ciudad=ciudad;
        }else{
            System.err.println("No se puede modificar la ciudad");
        }
    }


}
