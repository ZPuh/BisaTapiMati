package Mei2024;

import java.util.ArrayList;

public class Tgl23BruteForce {
    
    public static void main(String[] args) {
        // Buatlah sebuah program yang mencari empat angka dalam array yang jika dijumlahkan hasilnya sama dengan angka tertentu.
        // Input: arr = {1, 0, -1, 0, -2, 2}, target = 0
        // Output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
      
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(jumlahArray(arr, target));
    }
    
    static ArrayList<ArrayList<Integer>> jumlahArray(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            list.add(arr[l]);
                            listArray.add(list);
                        }
                    }
                }
            }
        }
        return listArray;
    }
}
