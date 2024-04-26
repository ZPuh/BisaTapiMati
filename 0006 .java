package April2024;

public class Tgl26A {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    public static String maskify(String str) {        
        if (str.length() <= 4) {
            return str;
        }        
        String masked = "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
        return masked;
    }
}
