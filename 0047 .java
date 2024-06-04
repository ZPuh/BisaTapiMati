package Kyu7.TheAlphabetProduct;

import java.util.Arrays;

public class Kata {

    public static long alphabet(long[] ns) {
        Arrays.sort(ns);
        return ns[7] / (ns[0] * ns[1] == ns[2] ? ns[3] : ns[2]);
    }

    public static void main(String[] args) {
        long[] numbers = {3, 5, 15, 45, 20, 60, 75, 240};
        System.out.println(alphabet(numbers));  // Output harus 20, yang merupakan nilai D
    }
}
