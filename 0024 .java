package Mei2024;

public class Tgl14 {

    public static void main(String[] args) {
        // menemukan nilai yang paling dekat dengan nol dari Array bilangan bulat yang diberikan
        int arr1[] = {10, 3, 9, 1};
        System.out.println(find(arr1));

        int arr2[] = {2, 4, -1, -3};
        System.out.println(find(arr2));

        int arr3[] = {13, 0, -6};
        System.out.println(find(arr3));

        int arr4[] = {5, 2, 2};
        System.out.println(find(arr4));
    }

    public static Integer find(int[] arr) {
        if (arr.length == 0) {
            return null;  // Mengantisipasi kasus array kosong, meskipun dijamin array tidak pernah kosong
        }

        int closestValue = arr[0];
        int minDistance = Math.abs(arr[0]);
        boolean hasSameDistance = false;

        for (int i = 1; i < arr.length; i++) {
            int currentDistance = Math.abs(arr[i]);

            if (currentDistance < minDistance) {
                closestValue = arr[i];
                minDistance = currentDistance;
                hasSameDistance = false;
            } else if (currentDistance == minDistance) {
                if (arr[i] != closestValue) {
                    hasSameDistance = true;
                }
            }
        }

        return hasSameDistance ? null : closestValue;
    }
}
