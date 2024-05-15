package Mei2024;

import java.util.Arrays;

public class Tgl15 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(6, 3)));
        System.out.println(Arrays.toString(solve(8, 2)));
        System.out.println(Arrays.toString(solve(10, 3)));
        System.out.println(Arrays.toString(solve(12, 4)));
        System.out.println(Arrays.toString(solve(12, 5)));
        System.out.println(Arrays.toString(solve(50, 10)));
        System.out.println(Arrays.toString(solve(50, 4)));
        System.out.println(Arrays.toString(solve(10, 5)));
        System.out.println(Arrays.toString(solve(100, 5)));
        System.out.println(Arrays.toString(solve(1000, 5)));

    }

    public static int[] solve(int s, int g) {
        // Jika s tidak habis dibagi g, maka tidak ada pasangan yang mungkin
        if (s % g != 0) {
            return new int[]{-1, -1};
        }

        // Hitung k = s / g
        int k = s / g;

        // Cari pasangan (x, y) yang relatif prima dan x + y = k
        for (int x = 1; x < k; x++) {
            int y = k - x;
            if (gcd(x, y) == 1) {
                // Jika ditemukan, hitung a dan b
                int a = g * x;
                int b = g * y;
                // Kembalikan dalam urutan menaik
                return new int[]{Math.min(a, b), Math.max(a, b)};
            }
        }

        // Jika tidak ada pasangan yang ditemukan
        return new int[]{-1, -1};
    }

    // Method untuk menghitung FPB menggunakan algoritma Euclidean
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
