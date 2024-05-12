package Mei2024;

import java.util.Arrays;

public class Tgl12A {

    public static void main(String[] args) {
        // Program ini akan mengeluarkan elemen-elemen terbesar dari array berdasarkan panjang n 
        int[] array1 = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(largest(2, array1)));
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(largest(1, array2)));
        int[] array3 = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(largest(4, array3)));
        int[] array4 = {1, 2, 1, 1};
        System.out.println(Arrays.toString(largest(3, array4)));
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(largest(5, array5)));
        int[] array6 = {7, 6, 8};
        System.out.println(Arrays.toString(largest(0, array6)));
    }

    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[n];
        int length = arr.length - n;
        for (int i = 0; i < n; i++) {
            result[i] = arr[length + i];
        }
        return result;
    }
}
