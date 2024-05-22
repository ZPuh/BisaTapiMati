package Mei2024;

public class Tgl22BruteForce {

    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari tiga angka dalam array yang jika dijumlahkan hasilnya sama dengan angka tertentu.
        // Input: arr = {12, 3, 4, 1, 6, 9}, target = 24
        // Output: true (karena 12 + 3 + 9 = 24)

        int[] arr = {12, 3, 4, 1, 6, 9};
        int target1 = 24;
        int target2 = 30;
        System.out.println(cekNumbers(arr, target1));
        System.out.println(cekNumbers(arr, target2));
    }

    static boolean cekNumbers(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
