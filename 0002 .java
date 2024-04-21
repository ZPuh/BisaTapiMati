package April2024;

import java.util.Scanner;

public class Tgl22AprilA {
    
    public static void main(String[] args) {
        // Program Menghitung Jumlah Huruf Vokal Pada Suatu Kalimat
        // Huruf Vokal (a , i , u , e , o)
        Scanner scanner = new Scanner (System.in);
        String  kata = scanner.nextLine();
        System.out.println(getCount(kata));
        
    }
    public static int getCount(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'i', 'u', 'e', 'o' -> count++;
            }
        }
        return count;
    }
}

