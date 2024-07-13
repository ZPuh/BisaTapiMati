package StringToInteger;

class Solution {

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));

    }

    public static int myAtoi(String s) {
        s = s.trim(); 
        if (s.isEmpty()) {
            return 0; 
        }
        int sign = 1;
        int start = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (s.charAt(0) == '+') {
            start = 1;
        }

        StringBuilder temp = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            temp.append(c);
        }

        if (temp.length() == 0) {
            return 0; 
        }
        try {
            return sign * Integer.parseInt(temp.toString());
        } catch (NumberFormatException e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

    }
}
