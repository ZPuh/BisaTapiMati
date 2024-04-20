package April2024;

import java.util.ArrayList;
import java.util.Arrays;

public class Tgl20A {

    public static void main(String[] args) {
        // mengambil sebuah array dan menghapus setiap elemen kedua dari array tersebut
        Object[] arr1 = {"Hello", "Goodbye", "Hello Again"};
        System.out.println(Arrays.toString(removeEveryOther(arr1)));
        Object[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(removeEveryOther(arr2)));
        Object[] arr3 = {"Muhammad", "Alex", "Zuhdi"};
        System.out.println(Arrays.toString(removeEveryOther(arr3)));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Object obj : arr) {
            arrayList.add(obj);
        }
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (i % 2 != 0) {
                arrayList.remove(i);
            }
        }
        return arrayList.toArray();
    }
}
