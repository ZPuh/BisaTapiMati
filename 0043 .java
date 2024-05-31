package Kyu7.CountTheDivisorsOfANumber;

public class FindDivisor {

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4)); // 3
        System.out.println(numberOfDivisors(5)); // 2
        System.out.println(numberOfDivisors(12)); // 6
        System.out.println(numberOfDivisors(30)); // 8
    }

    public static long numberOfDivisors(int n) {
        long count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
            count++;
            }
        }
        return count;
    }

}
