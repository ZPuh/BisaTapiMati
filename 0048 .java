import java.util.HashMap;
import java.util.Scanner;

public class MinEs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<String, String> map1, map2;

        map1 = new HashMap<>();
        map1.put("AB", "AA");
        map1.put("DC", "AB");
        map1.put("CC", "AC");
        map1.put("CB", "AD");
        map1.put("CA", "BA");
        map1.put("DA", "BB");
        map1.put("CD", "BC");
        map1.put("DD", "BD");
        map1.put("BC", "CA");
        map1.put("AA", "CB");
        map1.put("BA", "CC");
        map1.put("DB", "CD");
        map1.put("BD", "DA");
        map1.put("AD", "DB");
        map1.put("BB", "DC");
        map1.put("AC", "DD");

        map2 = new HashMap<>();
        map2.put("CD", "AA");
        map2.put("BB", "AB");
        map2.put("AC", "AC");
        map2.put("CC", "AD");
        map2.put("CB", "BA");
        map2.put("DB", "BB");
        map2.put("AD", "BC");
        map2.put("DD", "BD");
        map2.put("DA", "CA");
        map2.put("DC", "CB");
        map2.put("BC", "CC");
        map2.put("BD", "CD");
        map2.put("AA", "DA");
        map2.put("BA", "DB");
        map2.put("CA", "DC");
        map2.put("AB", "DD");

        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(map1.get(map2.get(input.substring(i, i + 2))));
        }
    }
}
