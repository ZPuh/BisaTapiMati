package ZigZagConversion;

public class Latihan1 {

    public static void main(String[] args) {
        String s = "PROGRAMMING";
        int index = 0;
        int baris = 1;
        while (index < s.length()) {
            for (int i = 0; i < baris; i++) {
                if (index < s.length()) {
                    System.out.print(s.charAt(index) + " ");
                    index++;
                }
            }
            System.out.println("");
            baris++;
        }
    }
}
