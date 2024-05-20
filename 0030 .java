package Mei2024;

import java.util.Arrays;

public class Tgl20DoubleEveryOther {

    public static void main(String[] args) {
        // 
        int[] a1 = new int[]{1,2,3,4}; // 1 4 3 8
        System.out.println(Arrays.toString(doubleEveryOther(a1)));
        int[] a2 = new int[]{1,19,6,2,12,-3}; // 1 38 6 4 12 -6
        System.out.println(Arrays.toString(doubleEveryOther(a2)));
        int[] a3 = new int[]{-1000,1653,210,0,1}; // -1000 3306 210 0 1
        System.out.println(Arrays.toString(doubleEveryOther(a3)));
    }

    public static int[] doubleEveryOther(int[] a) {
        for (int i = 1; i < a.length; i+=2) {
            a[i] += a[i];
        }
        return a;
    }
}
