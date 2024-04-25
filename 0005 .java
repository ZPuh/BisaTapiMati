package April2024;

public class Tgl25A {

    public static void main(String[] args) {
        // Mengembalikan jumlah huruf kata terpendek
        // Input : Rubah coklat yang gesit melompati anjing pemalas
        // output: 4
        // Input : Keadilan sosial bagi seluruh rakyat indonesia
        // output: 4
        // Input : Aku Anak Yang Baik Hati
        // output: 3
        
        System.out.println(findShort("Rubah coklat yang gesit melompati anjing pemalas"));
        System.out.println(findShort("Keadilan sosial bagi seluruh rakyat indonesia"));
        System.out.println(findShort("Aku Anak Yang Baik Hati"));
    }
    public static int findShort(String s) {
        String array[] = s.split(" ");
        int min = array[0].length();
        for (int i = 0; i < array.length; i++) {
            min = min > array[i].length() ? array[i].length() : min;
        }
        return min;
    }
}

