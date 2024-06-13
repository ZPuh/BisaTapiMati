package SearchingAlgorithm;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int x = 30;

        System.out.println(Arrays.toString(array));
        System.out.println("key : "+x);
        int result = search(array, x);

        if (result == 1) {
            System.out.println("Tidak Ditemukan");
        } else {
            System.out.println(x + " Ditemukan Di Index "+result);
        }

    }

    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
