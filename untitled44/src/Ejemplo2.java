import java.util.Arrays;

public class Ejemplo2 {
    public static void main(String[] args) {
        int[] n={2, 3, 4, 5, 6};
        int[] a = n.clone();
        a[2] = 100;
        System.out.println(n);
        System.out.println(a);
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(a));
    }

    static void sumar(int[] arr, int n){
        System.out.println(arr);
        int suma=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
