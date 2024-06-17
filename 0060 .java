package HackerRank;

import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        
        for (int i = 0; i < input.length; i++) {
        int sum = 0;
            for (int j = i; j < input.length; j++) {
                sum += input[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
