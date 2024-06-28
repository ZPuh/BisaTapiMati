package M1;

public class LAtihan4 {

    public static void main(String[] args) {
        // mengkapitalisasi (mengubah menjadi huruf besar) karakter-karakter pada 
        // posisi tertentu dalam sebuah string, berdasarkan indeks yang diberikan dalam array. 
        int[] arr = {1, 2, 5};
        System.out.println(capitalize("abcdef", arr)); //"aBCdeF"
    }

    public static String capitalize(String s, int[] ind) {
        StringBuilder capital = new StringBuilder(s);
        for (int i : ind) {
            if (i >= 0 && i < s.length()) {
                capital.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        return capital.toString();
    }
}
