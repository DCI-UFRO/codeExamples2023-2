package personas;

public final class Empleado extends Persona {
    private String rol;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String rol) {
        super(nombre);
        this.rol = rol;
    }


}
