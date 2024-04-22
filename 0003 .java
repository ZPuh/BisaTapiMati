package April2024;

import java.util.Scanner;

public class Tgl23A {

    public static void main(String[] args) {
        // Mencari character tengah pada suatu kata
        // contoh 
        // "asep" --> se
        // "zuhdi" --> h
        // "KaMbAcOnG" --> A
        // "z" --> z
        Scanner scanner = new Scanner (System.in);
        String kata = scanner.next();
        System.out.println(Median(kata));
        
        
    }
    public static String Median(String kata) {
        int length = kata.length();
        int middleIndex = length / 2;
        
        if (length % 2 == 0) {
            return kata.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return kata.substring(middleIndex, middleIndex + 1);
        }
    }
}

