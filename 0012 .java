package Mei2024;

import java.util.Scanner;

public class Tgl02Mei {

    public static void main(String[] args) {
        // Deret Fibonacci
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        System.out.print(f1+" "+f2+" ");
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            if (i < n) {
                System.out.print(fn+" ");
            }
            f1 = f2;
            f2 = fn;
        }
    }

}
