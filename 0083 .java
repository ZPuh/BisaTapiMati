package RegularExpressionMatching;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
    }

    public static boolean isMatch(String s, String p) {
        int[][] memo = new int[s.length() + 1][p.length() + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length(); j >= 0; j--) {
                boolean ans;
                if (j == p.length()) {
                    ans = i == s.length();
                } else {
                    boolean firstMatch = (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));
                    if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                        ans = (memo[i][j + 2] == 1 || (firstMatch && memo[i + 1][j] == 1));
                    } else {
                        ans = firstMatch && (memo[i + 1][j + 1] == 1);
                    }
                }
                memo[i][j] = ans ? 1 : 0;
            }
        }

        return memo[0][0] == 1;
    }
}
