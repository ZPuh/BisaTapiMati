package Mei2024;

public class Tgl05c {

    public static void main(String[] args) {
        // Menjumlahkan 2 Bilangan Bulat serta mengembalikan hasilnya dalam bilangan biner

        System.out.println(binaryAddition(1, 1)); // 10
        System.out.println(binaryAddition(5, 9)); // 1110
    }

    public static String binaryAddition(int a, int b) {
        int hasil = a + b;
        String biner = "";
        while (hasil != 0) {
            if (hasil % 2 != 0) {
                biner += "1";
                hasil = hasil / 2;
            } else {
                biner += "0";
                hasil = hasil / 2;
            }
        }
        String reverse = "";
        for (int i = biner.length(); i > 0; i--) {
            char c = biner.charAt(i - 1);
            reverse += Character.toString(c);
        }
        return reverse;
    }
}
