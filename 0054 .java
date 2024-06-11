package Latihan8Juni;

public class Soal15 {

    public static void main(String[] args) {
        int[] nums1 = {5,4,3,7,6,11};
        int[] nums2 = {1,2,10,8,9};
        
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Pastikan nums1 adalah array yang lebih kecil
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int halfLength = (totalLength + 1) / 2;

        int left = 0, right = m;

        while (left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = halfLength - partition1;

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Jika totalLength ganjil, median adalah elemen terbesar dari bagian kiri
                if (totalLength % 2 == 1) {
                    return (double) Math.max(maxLeft1, maxLeft2);
                } else {
                    // Jika totalLength genap, median adalah rata-rata dari elemen terbesar dari bagian kiri dan elemen terkecil dari bagian kanan
                    return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                }
            } else if (maxLeft1 > minRight2) {
                right = partition1 - 1;
            } else {
                left = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

}
