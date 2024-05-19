package Mei2024;
/*
kamu akan diberikan sebuah string, dan tugasmu adalah mengembalikan sebuah array bilangan bulat yang menggambarkan 
jumlah huruf kapital, huruf kecil, angka, dan karakter khusus dalam string tersebut, seperti berikut:

Solve("*'&ABCDabcde12345") = [4,5,5,3].

Urutan Element: huruf kapital, huruf kecil, angka, dan karakter khusus.
*/

import java.util.Arrays;

public class Tgl19SimpleStringCharacters {

    public static void main(String[] args) {
        // uppercase letters, lowercase, numbers and special characters.
        System.out.println(Arrays.toString(Solve("CbgA5<1d-tOwUZTS8yQ")));
        System.out.println(Arrays.toString(Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H")));
        System.out.println(Arrays.toString(Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD")));
        System.out.println(Arrays.toString(Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe")));
        System.out.println(Arrays.toString(Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft")));
    }

    public static int[] Solve(String word) {
        //enjoy coding 
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countChar = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                countUpper++;
            }else if (Character.isLowerCase(word.charAt(i))){
                countLower++;
            }else if (Character.isDigit(word.charAt(i))) {
                countNum++;
            }else {
                countChar++;
            }
        }
        return new int[]{countUpper,countLower,countNum,countChar};
    }
}
