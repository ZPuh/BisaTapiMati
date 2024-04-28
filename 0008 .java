package April2024;

public class Tgl28A {

    public static void main(String[] args) {
        System.out.println(checkForFactor(10, 2));
        System.out.println(checkForFactor(100, 25));
        System.out.println(checkForFactor(345636, 5));
        System.out.println(checkForFactor(4623856, 3));
    }

    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0) {
            return true;
        } else {
            return false;
        }
    }
}
