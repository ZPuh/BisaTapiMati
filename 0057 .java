package HackerRank;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] array2d = new int[6][6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int sumb = Integer.MIN_VALUE;

        for (int i = 0; i < array2d.length-2; i++) {
            for (int j = 0; j < array2d[i].length-2 ; j++) {
                sum = array2d[i][j] + array2d[i][j + 1] + array2d[i][j + 2] + array2d[i+1][j+1] + 
                        array2d[i+2][j] + array2d[i+2][j+1] + array2d[i+2][j+2];

                if (sum > sumb) {
                    sumb = sum;
                }
            }
        }

        System.out.println(sumb);

    }

}
.java
