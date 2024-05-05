package Mei2024;

public class PIN {

    public static void main(String[] args) {
        // Program PIN
        // Kriteria validasi PIN yang diberikan adalah sebagai berikut:
        // - PIN harus terdiri dari 4 digit atau tepat 6 digit.
        // - PIN tidak boleh mengandung karakter selain digit angka.
        
        // Contoh
        // - "1234" merupakan PIN yang valid karena terdiri dari tepat 4 digit angka.
        // - "12345" bukan PIN yang valid karena memiliki 5 digit.
        // - "a234" bukan PIN yang valid karena mengandung karakter selain digit angka.
        
        System.out.println(validatePin("1234")); // True
        System.out.println(validatePin("12345"));// False
        System.out.println(validatePin("a234")); // False
        
        boolean a = Character.isDigit(0);
    }

    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
