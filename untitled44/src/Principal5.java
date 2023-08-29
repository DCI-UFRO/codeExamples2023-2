import java.util.Arrays;

public class Principal5 {
    public static void main(String[] args) {
        boolean[] n = {};
        int num;
        try{
            num = Integer.parseInt("10000000000000000");
        }catch(NumberFormatException e){
            num=-2;
            System.err.println("Error de formato");
        }catch(Exception e){
            System.err.println(e);
            num=-1;
        }
        System.out.println(num);

    }
}
