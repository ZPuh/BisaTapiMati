package Kyu6.SortTwoArrays;

import java.util.Arrays;

public class ArraySorter2 {

    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {6, 5, 7, 8, 9};

        System.out.println(Arrays.deepToString(sortTwoArrays(arr1, arr2)));
    }

    public static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
        int[] beforeArr1 = Arrays.copyOf(arr1, arr1.length);
        int[] beforeArr2 = Arrays.copyOf(arr2, arr2.length);

        Integer[] indexArr1 = new Integer[arr1.length];
        Integer[] indexArr2 = new Integer[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            indexArr1[i] = i;
            indexArr2[i] = i;
        }

        Arrays.sort(indexArr2, (i, j) -> Integer.compare(arr2[i], arr2[j]));

        int[] sortedArr1 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sortedArr1[i] = beforeArr1[indexArr2[i]];
        }

        Arrays.sort(indexArr1, (i, j) -> Integer.compare(arr1[i], arr1[j]));

        int[] sortedArr2 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            sortedArr2[i] = beforeArr2[indexArr1[i]];
        }

        return new int[][]{sortedArr1, sortedArr2};
    }
}
