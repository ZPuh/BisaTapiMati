package Mei2024;

public class Tgl9 {

    public static void main(String[] args) {
        // menghitung nilai dari deret matematika
        // Deret = 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 + ...
        // Input : 1 
        // output : 1 --> "1.00"

        // Input : 2 
        // output --> 1 + 1/4 --> "1.25"
        
        // Input : 5 
        // --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
        
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (3 * i + 1);
        }
        return String.format("%.2f", sum);
    }
}

