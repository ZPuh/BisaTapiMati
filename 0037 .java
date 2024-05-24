package Mei2024;

import java.util.HashMap;

public class Tgl24HashMap {

    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari elemen mayoritas dalam array. 
        // Elemen mayoritas adalah elemen yang muncul lebih dari n/2 kali di mana n adalah ukuran array.
        // Input: arr = {3, 3, 4, 2, 4, 4, 2, 4, 4}
        // Output: 4
        int[] numbers = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(elementMayoritas(numbers));
        int[] numbers2 = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(elementMayoritas(numbers2));
    }

    static int elementMayoritas(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = arr.length / 2;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }
        return 0;
    }
}
