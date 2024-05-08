package Mei2024;

public class Tgl8 {

    public static void main(String[] args) {
        // Reverse Kata
        
        System.out.println(reverseWords("This is an example!"));
        // output : sihT si na !elpmaxe
        System.out.println(reverseWords("double  spaces"));
        // output : elbuod  secaps
    }

    public static String reverseWords(final String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        String[] words = original.split("(?<=\\s)|(?=\\s)");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            if (!word.matches("\\s+")) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversedString.append(reversedWord);
            } else {
                reversedString.append(word);
            }
        }

        return reversedString.toString();
    }
}
