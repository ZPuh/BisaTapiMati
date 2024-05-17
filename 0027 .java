package Mei2024;
/*
Balanced Number adalah bilangan di mana jumlah digit di sebelah kiri digit tengah (atau dua digit tengah) sama dengan jumlah digit di sebelah kanan.

Aturan:
Jika jumlah digit ganjil (Satu digit tengah.):
Contoh: 92645 (digit tengah: 6, jumlah kiri: 9+2=11, jumlah kanan: 4+5=9 → "Not Balanced").

Jika jumlah digit genap (Dua digit tengah.):
Contoh: 1301 (digit tengah: 3 dan 0, jumlah kiri: 1, jumlah kanan: 1 → "Balanced").
Digit tengah tidak dihitung dalam jumlah kiri atau kanan.

Contoh:
7: Balanced (kiri: 0, kanan: 0)
295591: Not Balanced (kiri: 2+9=11, kanan: 5+1=10)
959: Balanced (kiri: 9, kanan: 9)
27102983: Not Balanced (kiri: 2+7+1=10, kanan: 9+8+3=20)

Tugas:
Tentukan digit tengah (atau dua digit tengah).
Hitung jumlah digit di kiri dan kanan digit tengah.
Bandingkan jumlah tersebut:
Jika sama: "Balanced"
Jika tidak: "Not Balanced"
*/
public class Tgl17BalancedNumber {

    public static void main(String[] args) {
        // Tentukan apakah sebuah bilangan adalah "Balanced" atau "Not Balanced".
        System.out.println(balancedNum(7));
        System.out.println(balancedNum(295591));
        System.out.println(balancedNum(959));
        System.out.println(balancedNum(27102983));
    }

    public static String balancedNum(long number) {
        String str = Long.toString(number);
        int length = str.length();
        int middle = length / 2;

        int leftSum = 0;
        int rightSum = 0;

        if (length % 2 == 0) { // Jika panjangnya genap
            for (int i = 0; i < middle - 1; i++) {
                leftSum += Character.getNumericValue(str.charAt(i));
            }
            for (int i = middle + 1; i < length; i++) {
                rightSum += Character.getNumericValue(str.charAt(i));
            }
        } else { // Jika panjangnya ganjil
            for (int i = 0; i < middle; i++) {
                leftSum += Character.getNumericValue(str.charAt(i));
            }
            for (int i = middle + 1; i < length; i++) {
                rightSum += Character.getNumericValue(str.charAt(i));
            }
        }

        return leftSum == rightSum ? "Balanced" : "Not Balanced";
    }
}
