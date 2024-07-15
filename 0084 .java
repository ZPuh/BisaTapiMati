package Kyu8.Mergingsortedintegerarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Kata {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] c = {1, 3, 5};
        int[] d = {2, 4, 5};

        System.out.println(Arrays.toString(mergeArrays2(a, b)));
        System.out.println(Arrays.toString(mergeArrays2(c, d)));
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        ArrayList<Integer> com = new ArrayList<>();

        int max = Math.max(first.length, second.length);

        for (int i = 0; i < max; i++) {
            if (i < first.length) {
                com.add(first[i]);
            }
            if (i < second.length) {
                com.add(second[i]);
            }
        }

        Collections.sort(com);

        for (int i = 1; i < com.size(); i++) {
            if (com.get(i).equals(com.get(i - 1))) {
                com.remove(i);
                i--; // Kurangi i agar tidak melewatkan elemen berikutnya
            }
        }

        int[] comb = new int[com.size()];

        for (int i = 0; i < comb.length; i++) {
            comb[i] = com.get(i);
        }

        return comb;
    }

    public static int[] mergeArrays2(int[] first, int[] second) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : first) {
            set.add(i);
        }

        for (int i : second) {
            set.add(i);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }

        return result;
    }

}
