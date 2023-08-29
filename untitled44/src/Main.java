import java.util.GregorianCalendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        if(g.isLeapYear(2000)){
            System.out.println("es biciesto");
        }else{
            System.out.println("no es biciesto");
        }
    }
}