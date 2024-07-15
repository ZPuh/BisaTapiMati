package Kyu7.MeanvsMedian;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = {1,3,5,7,2,4,6,2};
        System.out.println(meanVsMedian(data));
    }

    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double mean = (double) sum / numbers.length; 

        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }

        if (mean == median) {
            return "same";
        } else if (mean > median) {
            return "mean";
        } else {
            return "median";
        }
    }
}
