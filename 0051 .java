package Latihan8Juni;
// Basic Sequence Practice

import java.util.Arrays;

public class Soal8 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(-5)));
    }

    public static int[] sumOfN(int n) {
        int[] deret = new int[Math.abs(n) + 1];
        int der = 0;
        for (int i = 0; i < deret.length; i++) {
            if (n < 0) {
                der -= i;
                deret[i] = der;
            } else {
                der += i;
                deret[i] = der;
            }
        }
        return deret;
    }
}
