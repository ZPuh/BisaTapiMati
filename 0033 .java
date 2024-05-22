package Mei2024;

import java.util.Arrays;
import java.util.HashMap;

public class Tgl22HashMap {
    
    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari dua angka dalam array yang jika 
        // dijumlahkan hasilnya sama dengan angka tertentu, dan kembalikan indeks dari kedua angka tersebut.
        // Input: arr = {2, 7, 11, 15}, target = 9
        // Output: [0, 1] (karena 2 + 7 = 9)

        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(indeksArray(arr1, target1)));
        
        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(indeksArray(arr2, target2)));
    }
    
    static int[] indeksArray(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}
