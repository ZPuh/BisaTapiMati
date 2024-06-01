package Kyu7.DoubleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleSort {

    // Mengurutkan elemen-elemen dalam sebuah array yang terdiri dari angka dan string, atau kombinasi keduanya.
    public static void main(String[] args) {
        Object[] inputArray = {3, "apple", 1, "banana", 2, "cherry"};
        Object[] outputArray = dbSort(inputArray);
        System.out.println(Arrays.toString(outputArray));  // Output: [1, 2, 3, apple, banana, cherry]
    }

    public static Object[] dbSort(Object[] a) {
        // Buat 2 List Untuk Memisahkan angka dengan String
        List<Number> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        // Pisahkan angka dan string
        for (Object obj : a) {
            if (obj instanceof Number) {
                numbers.add((Number) obj);
            } else if (obj instanceof String) {
                strings.add((String) obj);
            }
        }

        // Urutkan masing-masing list
        numbers.sort((o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                return Integer.compare((Integer) o1, (Integer) o2);
            } else if (o1 instanceof Double && o2 instanceof Double) {
                return Double.compare((Double) o1, (Double) o2);
            } else if (o1 instanceof Float && o2 instanceof Float) {
                return Float.compare((Float) o1, (Float) o2);
            } else {
                return Double.compare(o1.doubleValue(), o2.doubleValue());
            }
        });
        strings.sort(String::compareTo);

        // Gabungkan hasil urutan ke dalam satu array
        List<Object> result = new ArrayList<>();
        result.addAll(numbers);
        result.addAll(strings);

        return result.toArray();
    }
}
