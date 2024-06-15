
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;

        int result = binarySearch(array, key);
        System.out.println(Arrays.toString(array));
        System.out.println("Key : "+key);
        if (result == -1) {
            System.out.println("Tidak Ditemukan");
        } else {
            System.out.println(key + " Ditemukan Di element " + result);
        }

    }

    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
