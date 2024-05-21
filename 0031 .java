import java.util.HashMap;

public class MultiplicationResult {

    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari dua angka dalam array yang jika dikalikan hasilnya sama dengan angka tertentu.
        // Contoh:
        // Input: arr = {2, 4, 1, 6, 5, 10, -1}, target = 20
        // Output: true (karena 4 * 5 = 20)
        int[] array = {0, 2, 4, 1, 6, 5, 10, -1};
        int target1 = 20;
        int target2 = 15;
        System.out.println(cara1(array, target1));
        System.out.println(cara1(array, target2));
        System.out.println(cara2(array, target1));
        System.out.println(cara2(array, target2));
    }

    static boolean cara1(int[] array, int target) {
        for (int q = 0; q < array.length; q++) {

            for (int i = q + 1; i < array.length; i++) {
                if (array[q] * array[i] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean cara2(int[] array, int target) {
        if (target == 0) {
            return false; // Untuk menghindari pembagian dengan nol
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (num != 0 && target % num == 0) {
                int complement = target / num;
                if (map.containsKey(complement)) {
                    return true;
                }
            }
            map.put(num, num);
        }
        return false;
    }

}
