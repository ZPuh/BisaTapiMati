package Kyu8.Multiplythenumber;

public class Kata {

    public static void main(String[] args) {
        System.out.println(multiply(-3));
    }

    public static int multiply(int number) {
        String d = Integer.toString(number);
        int digit = d.length();
        if (number < 0) {
            digit -= 1;
        }
        return number * (int) (Math.pow(5, digit));
    }
    // return number * (int)Math.pow(5, (Math.abs(number) + "").length());
}
