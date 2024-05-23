package Mei2024;

import java.util.Arrays;
import java.util.HashMap;

public class Tgl23HashMap {

    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari dua angka dalam array yang jika 
        // dikalikan hasilnya sama dengan angka tertentu, dan kembalikan indeks dari kedua angka tersebut.

        // Input: arr = {3, 4, 6, 8}, target = 24
        // Output: [1, 2] (karena 4 * 6 = 24)
        int[] arr1 = {3, 4, 6, 8};
        int target1 = 24;
        System.out.println(Arrays.toString(cekIndeks(arr1, target1)));

        int[] arr2 = {2, 5, 7, 10};
        int target2 = 14;
        System.out.println(Arrays.toString(cekIndeks(arr2, target2)));
    }

    static int[] cekIndeks(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && target % arr[i] == 0) {
                int hp = target / arr[i];
                if (map.containsKey(hp)) {
                    return new int[]{map.get(hp), i};
                }
                map.put(arr[i], i);
            }
        }
        return null;
    }
}
