package Mei2024;

public class Tgl7 {

    public static void main(String[] args) {
        // Temukan bilangan prima terbesar yang tidak lebih dari n.
        //Contoh Test Case:
        // Input n : 10
        // Output: 7

        // Input n : 20
        // Output: 19

        int maxPrima = 0;
        int i = 2;
        int n = 20;
        while (i < n) {
            if (cekPrima(i)) {
                maxPrima = i;
            }
            i++;
        }
        System.out.println(maxPrima);
    }

    static boolean cekPrima(int b) {
        if (b <= 1) {
            return false;
        }
        for (int i = 2; i <= b / 2; i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }

}
