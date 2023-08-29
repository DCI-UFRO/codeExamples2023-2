public class Principal2 {
    public static void main(String[] args) {

        contador(0);

    }

    private static int contador(int n) {
        if(n>10){
            return n;
        }else{
            System.out.println(n);
            return contador(++n);
        }

    }
}
