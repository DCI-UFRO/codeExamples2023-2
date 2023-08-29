public class Ejemplo1 {
    public static void main(String[] args) {

        int num;
        try{
            num = Integer.parseInt("10");
        }catch(NumberFormatException e){
            System.err.println(e);
            num=-2;
        }catch(Exception e){
            System.err.println(e);
            num=-1;
        }
        System.out.println(num);

    }
}
