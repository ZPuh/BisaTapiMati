package April2024;

public class Tgl21A {

    public static void main(String[] args) {
        int batasAkhir = 5;

        int count = 0;
        int bilPrima = 0;
        int sum = 0;
        while (count < batasAkhir) {
            if (cekPrima(bilPrima)) {
                if (count > 0 && count < batasAkhir) {
                    System.out.print(" + ");
                }
                System.out.print(bilPrima);
                sum += bilPrima;
                count++;
            }
            bilPrima++;
        }
        System.out.print(" = " + sum);
        System.out.println("");

    }

    static boolean cekPrima(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
