public class Principal4 {
    public static void main(String[] args) {
        int a;
        a = sumar(2, 33, 2,4);
        System.out.println(a);
    }

    private static int sumar(int... num2 ) {
        System.out.println(num2);
        int suma = 0;
        for(int i: num2){
            suma+=i;
        }
        return suma;
    }

    private static int sumar(int num1, int num2,int num3) {
        return num1+ num2+num3;
    }
}
