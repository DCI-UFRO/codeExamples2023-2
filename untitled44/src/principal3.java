import java.lang.reflect.Array;
import java.util.Arrays;

public class principal3 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8};
        int[] b = a.clone();
        b[2] = 100;
        suma(a,3);
        suma(b,10);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }



    private static void suma(int[] n, int n2) {
        System.out.println(n);
        for (int i=0;i<n.length;i++){
            n[i]+=n2;
        }
        System.out.println(Arrays.toString(n));
    }
}
