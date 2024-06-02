package Kyu7.Largest5DigitNumberInASeries;

public class LargestFiveDigitNumber {

    public static void main(String[] args) {
        // mencari urutan lima digit berturut-turut terbesar dalam sebuah string yang terdiri dari angka-angka. 
        System.out.println(solve("283910"));
        System.out.println(solve("1234567890"));
        System.out.println(solve("731674765"));
    }

    public static int solve(final String digits) {
        // menyimpan urutan lima digit terbesar
        int maxSequence = 0;
        // menyimpan panjang string input.
        int length = digits.length();

        // memastikan kita hanya mengambil urutan lima digit.
        for (int i = 0; i <= length - 5; i++) {
            String currentSequenceStr = digits.substring(i, i + 5);
            int currentSequence = Integer.parseInt(currentSequenceStr);

            if (currentSequence > maxSequence) {
                maxSequence = currentSequence;
            }
        }

        return maxSequence;
    }
}
