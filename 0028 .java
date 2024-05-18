package Mei2024;

public class Tgl18SingleDigit {

    public static void main(String[] args) {
        // Program Jumlah Angka 1 Di bilangan Biner
        
        System.out.println(singleDigit(5665));
        System.out.println(singleDigit(123456789));
        System.out.println(singleDigit(16));
    }

    static int singleDigit(int n) {
        if (n < 10) {
            return n;
        }
        while (true) {
            String binary = Integer.toBinaryString(n);
            int sum = 0;
            for (int i = 0; i < binary.length(); i++) {
                sum += binary.charAt(i) - '0';
            }
            if (sum < 10) {
                return sum;
            }
            n = sum;
        }
    }
}
