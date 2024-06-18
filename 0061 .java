package HackerRank;

import java.util.Scanner;

public class OutputFormating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int in = sc.nextInt();

            System.out.printf("%-15s%03d%n", str, in);
        }
        System.out.println("================================");
    }

}
