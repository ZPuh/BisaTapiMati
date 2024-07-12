package Kyu7.Powersofi;

public class Kata {

    public static void main(String[] args) {
        System.out.println(pofi(4));
    }

    public static String pofi(int n) {
        String[] array = {"1", "i", "-1", "-i"};
        return array[n % 4];
    }

}
