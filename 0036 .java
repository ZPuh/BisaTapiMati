package Mei2024;

import java.util.ArrayList;

public class Tgl24BruteForce {

    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari semua pasangan angka dalam array yang jika dijumlahkan hasilnya sama dengan angka tertentu.
        // Input: arr = {1, 5, 7, -1, 5}, target = 6
        // Output: [[1, 5], [7, -1], [1, 5], [5, 1], [-1, 7], [5, 1]]
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(jumlahAngka(arr, target));
    }

    static ArrayList<ArrayList<Integer>> jumlahAngka(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    listArray.add(list);
                }
            }
        }
        return listArray;
    }
}
