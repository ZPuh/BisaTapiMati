package Mei2024;

public class Tgl01A {
        /*
mengambil umur saat ini ayah dan umur saat ini anak sebagai argumen dan mengembalikan 
berapa tahun yang lalu atau di masa depan ayah menjadi dua kali lipat dari umur anaknya
    */

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30, 7));
        System.out.println(TwiceAsOld(44, 19));
        System.out.println(TwiceAsOld(45, 30));
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
       int umur = dadYears  - 2 * sonYears;
       return Math.abs(umur);
    }
}
