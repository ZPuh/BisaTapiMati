package BNPCHS2023.PENYISIHAN;

import java.util.*;

public class DjiodanMisdekripsi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N = sc.nextShort();
        sc.nextLine();
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '*') {
                count++;
                continue;
            }
            if (count % 2 != 0) {
                continue;
            } else {
                System.out.print(S.charAt(i));
            }
        }
    }
}
