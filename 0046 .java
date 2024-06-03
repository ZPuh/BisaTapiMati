package Kyu7.GuessTheSequence;

import java.util.Arrays;

public class JomoPipi {
// 1/30
// Mengurutkan angka Secara Leksikografis .

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sequence(9)));
        System.out.println(Arrays.toString(sequence(16)));
    }
    
    static int[] sequence(int x) {
        int[] array = new int[x];
        String[] ary = new String[x];
        
        for (int i = 0; i < x; i++) {
            ary[i] = String.valueOf(i + 1);
        }
        
        Arrays.sort(ary);
        
        for (int i = 0; i < x; i++) {
            array[i] = Integer.parseInt(ary[i]);
        }
        
        return array;
    }
}
