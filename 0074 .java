package Kyu7.Maxsumbetweentwonegatives;

public class MaxSumBetweenTwoNegatives {

    public static void main(String[] args) {
        int[] arr = {5, -1, -2};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int maxSum = -1;
        int currentSum = 0;
        boolean betweenNegatives = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (betweenNegatives) {
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                    currentSum = 0;
                }
                betweenNegatives = true;
            } else if (betweenNegatives) {
                currentSum += arr[i];
            }
        }
        return maxSum;
    }
}
