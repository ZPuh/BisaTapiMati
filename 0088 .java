package Kyu7.PasswordSystem;

public class Kata {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1};
        System.out.println(helpZoom(array));
    }

    public static String helpZoom(final int[] key) {
        boolean cek = true;
        for (int i = 0, j = key.length - 1; i < key.length; i++, j--) {
            if (key[i] != key[j]) {
                cek = false;
            }
        }
        if (cek) {
            return "Yes";
        } else {
            return "No";
        }
    }
};
