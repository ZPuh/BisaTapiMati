package PalindromeNumber;

class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String temp = Integer.toString(x);

        for (int i = temp.length() - 1, y = 0; i >= 0; i--, y++) {
            if (temp.charAt(i) != temp.charAt(y)) {
                return false;
            }
        }
        return true;
    }
}
