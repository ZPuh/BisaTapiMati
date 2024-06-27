package BNPCHS2023.PENYISIHAN;

import java.util.*;

public class DjiodanAgen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        n = sc.nextInt();
        s = sc.next();
        sc.close();
        String jwb = "-1";
        char[] lain = {'a', 'b', 'c'};
        do {
            boolean match = true;
            for (int a = 0; a < n; a++) {
                if (s.charAt(a) == '.')continue;
                if (s.charAt(a) != lain[a % 3]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                StringBuilder jwbBuilder = new StringBuilder();
                for (int a = 0; a < n; a++) {
                    jwbBuilder.append(lain[a % 3]);
                }
                jwb = jwbBuilder.toString();
                break;
            }
        } while (nextPermutation(lain));
        System.out.println(jwb);
    }

    public static boolean nextPermutation(char[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i <= 0)return false;
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }
        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
