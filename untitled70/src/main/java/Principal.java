import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria", 20);
        p1.addNumero(2);
        p1.addNumero(5);
        p1.addNumero(6);
        p1.addNumero(3);

        Animal mascota = new Animal("Perro");
        p1.addMascota(mascota);


        System.out.println(p1);
        Gson gsonObject = new Gson();
        String p1str = gsonObject.toJson(p1);
        System.out.println(p1str);

        Persona p2 = gsonObject.fromJson(p1str,Persona.class);
        System.out.println(p2);
    }
}
