package April2024;

public class Tgl24A {

    /*
membuat sebuah fungsi yang menerima string berisi angka-angka yang dipisahkan oleh spasi, 
dan kemudian mengembalikan angka tertinggi dan terendah dari angka-angka tersebut. 
Contoh-contoh yang diberikan menunjukkan bahwa string inputnya bisa berisi angka positif dan negatif.    
     */
    public static void main(String[] args) {
        // Input = "1 2 3 4 5"
        // Output= "5 1"
        // Input = "1 2 -3 4 5"
        // Output= "5 -3"
        // Input = "1 9 3 4 -5"
        // Output= "9 -5"

        System.out.println(highAndLow("1 2 3 4 5"));   // Output: "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));  // Output: "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));  // Output: "9 -5"
    }

    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n > highest) {
                highest = n;
            }
            if (n < lowest) {
                lowest = n;
            }
        }
        return highest + " " + lowest;
    }
}
