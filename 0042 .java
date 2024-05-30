package Kyu7.LatinSquares;

import java.util.Scanner;

public class LatinSquares {

    public static void main(String[] args) {
        // Latin Square
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] latinSquare = makeLatinSquare(n);

        // Cetak hasil Latin square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(latinSquare[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];

        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare[i].length; j++) {
                latinSquare[i][j] = (i + j) % n + 1;
            }
        }
        return latinSquare;
    }
}
