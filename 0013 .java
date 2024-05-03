package Mei2024;

public class Tgl03 {

    public static void main(String[] args) {
        // Program Jumlah Angka
        System.out.println(GetSum(0, -1)); // -1 (-1 + 0;
        System.out.println(GetSum(0, 1)); // 1  ( 0 + 1)
        System.out.println(GetSum(-1, 2)); // 2 ( -1 + 0 + 1 + 2 )
    }

    public static int GetSum(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
