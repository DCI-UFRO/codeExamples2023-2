import personas.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona p0 = new Persona("Miguel");
        Persona p1 = new Empleado("Jose", 200);
        p1.setEdad(25);
        System.out.println(p0.toString());
        System.out.println(p1.toString());


    }


}