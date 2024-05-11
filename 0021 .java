package Mei2024;

public class Tgl11E {

    public static void main(String[] args) {
        // Program PassWord
        // Syarat :
        // huruf i atau I, diganti angka 1 dalam kata sandi;
        // huruf o atau O, diganti angka 0 dalam kata sandi;
        // huruf s atau S, diganti angka 5 dalam kata sandi.

        // input : "Give me liberty or give me death" 
        // output : "Gml0gmd"
        // input : "Keep Calm and Carry On" 
        // output : "KCaC0"
        // input : ""
        // output : ""
        System.out.println(makePassword("Give me liberty or give me death"));
        System.out.println(makePassword("Keep Calm and Carry On"));
        System.out.println(makePassword(""));

    }

    public static String makePassword(String phrase) {
       String[] array = phrase.split(" ");
        String pw = "";
        if (phrase.isEmpty()) {
            return "";
        }
        for (String array1 : array) {
            switch (array1.charAt(0)) {
                case 'i', 'I' -> pw += "1";
                case 'o', 'O' -> pw += "0";
                case 's', 'S' -> pw += "5";
                default -> pw += array1.charAt(0);
            }
        }
        return pw;
    }
}
