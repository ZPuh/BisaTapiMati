package Belajar;

import java.util.*;

public class Nomor01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.next();
        System.out.println(encodeWord(kata));
    }

    public static String encodeWord(String word) {
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            int kodeHuruf = c - 'A' + 1;
            result.append(kodeHuruf);
        }
        return result.toString();
    }
}
