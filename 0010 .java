package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Quest0001 {

    public static void main(String[] args) {
//        Contoh 1:
//        Input: Array = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Karena array[0] + array[1] == 9, return [0, 1].

//        Contoh 2:
//        Input: Array = [3,2,4], target = 6
//        Output: [1,2]

//        Contoh 3:
//        Input: Array = [3,3], target = 6
//        Output: [0,1]
        
        Solution s = new Solution();
        int[] arrayAngka1 = {2, 7, 11, 15};        
        System.out.println(Arrays.toString(s.twoSum(arrayAngka1, 9))); // 0,1
        int[] arrayAngka2 = {3,2,4};        
        System.out.println(Arrays.toString(s.twoSum(arrayAngka2, 6))); // 1,2
        int[] arrayAngka3 = {3,3};        
        System.out.println(Arrays.toString(s.twoSum(arrayAngka3, 6))); // 0,1
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hashmap = new HashMap <>();
        for (int i = 0; i < nums.length; i++) {
            int hasil = target - nums[i];
            if (hashmap.containsKey(hasil)) {
                return new int[]{hashmap.get(hasil),i};
            }
            hashmap.put(nums[i],i);
        }
        return null;
    }
}
