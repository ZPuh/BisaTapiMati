package LeetCode.longestPalindrome;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Palindrom & Substring
        // Palindrom adalah kata yang jika dibalik artinya sama
        // contoh :
        // katak -> katak (Palindrom)
        // sapi -> ipas (bukan Palindrom)
        
        // Pada program ini saya membuat Substring palindrom 
        // yang mencari palindrom terpanjang di suatu kata
        // Contoh :
        // katakan -> {katak , ata , aka}
        // katak adalah palindrom terpanjang
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(longestPalindrome(word));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); 
            int len2 = expandAroundCenter(s, i, i + 1); 
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
