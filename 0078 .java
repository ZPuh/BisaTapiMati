package Kyu8.FindMultiplesofaNumber;

import java.util.*;

public class Multiples {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(2, 11)));
        System.out.println(Arrays.toString(find2(2, 11)));
    }

    public static int[] find(int base, int limit) {
        if (base < 0 || limit < 0) {
            return new int[]{};
        }
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = base; i <= limit; i += base) {
            arrList.add(i);
        }
        int[] array = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            array[i] = arrList.get(i);
        }
        return array;
    }

    public static int[] find2(int base, int limit) {
        int[] array = new int[limit / base];
        for (int i = base, n = 0; i <= limit; i += base, n++) {
            array[n] = i;
        }
        return array;
    }
}
