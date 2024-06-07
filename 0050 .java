package Latihan7Juni;

public class Soal5B {

    public static void main(String[] args) {
        System.out.println(removeAsterisks("Hello*World*", 1));
        System.out.println(removeAsterisks("Hello*World*", 2));
        System.out.println(removeAsterisks("Hello***World", 1));
        System.out.println(removeAsterisks("Hello***World", 100));
        System.out.println(removeAsterisks("*Hello*World*", 1));
        System.out.println(removeAsterisks("*Hello*World*", 2));
        System.out.println(removeAsterisks("*Hello*World*", 100));
        System.out.println(removeAsterisks("***Hello **World*** *world", 1));
        System.out.println(removeAsterisks("***Hello **World*** *world", 3));
        System.out.println(removeAsterisks("***Hello **World*** *world", 5));
        System.out.println(removeAsterisks("***Hello **World*** *world", 100));
    }

    public static String removeAsterisks(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' && count < n) {
                count++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
