package Mei2024;

public class Sid {

    public static void main(String[] args) {
        // Penjumlahan Matrix
        int a[][] = {{1, 0}, {0, 1}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int c[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 2}};
        System.out.println(sumOfElements(a));
        System.out.println(sumOfElements(b));
        System.out.println(sumOfElements(c));
    }

    public static int sumOfElements(int matrix[][]) {
        int sum = 0;
        for (int[] matrix1 : matrix) { 
            for (int j = 0; j < matrix1.length; j++) {
                sum += matrix1[j];
            }
        }
        return sum;
    }
}
