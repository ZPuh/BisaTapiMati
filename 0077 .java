package Kyu8.Findnumberswhicharedivisiblebygivennumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int div = 2;
        System.out.println(Arrays.toString(divisibleBy(num, div)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arr.add(numbers[i]);
            }
        }

        int[] array = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        return array;
    }
}
