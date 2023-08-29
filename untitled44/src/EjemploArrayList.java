import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        añadir(arr, 4, 4, 5, 6, 3, 4, 5);
        System.out.println(arr);

    }

    private static void añadir(ArrayList<Integer> arr, int ... i) {
        for (int j = 0; j < i.length; j++) {
            arr.add(i[j]);
        }
    }


}
