package Laihan6Juni;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Soal2 {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        System.out.println(filterOddNumber(listOfNumbers));
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> oddNumber = new LinkedList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 != 0) {
                oddNumber.add(listOfNumbers.get(i));
            }
        }
        return oddNumber;
    }
    // listOfNumbers.removeIf(i -> i%2 == 0);
}
