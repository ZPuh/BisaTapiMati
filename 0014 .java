package Mei2024;

public class Tgl04 {

    public static void main(String[] args) {
        // Mencari Kuadrad selanjutnya
        System.out.println(findNextSquare(121)); // 121 akar dari 11 jadi outputnya akar dari 12 = 144
        System.out.println(findNextSquare(625)); // 625 akar dari 25 jadi outputnya akar dari 26 = 676
        System.out.println(findNextSquare(114)); // karena tidak ada akar dari 114 maka program mengembalikan -1
    }

    public static long findNextSquare(long sq) {
        long squer = (long) Math.sqrt(sq);
        if (sq % squer != 0) {
            return -1;
        } else {
            squer++;
            return squer * squer;
        }
    }
}
