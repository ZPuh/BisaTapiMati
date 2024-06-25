package HackerRank;

import java.util.*;

public class JavaMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> personMap = new HashMap<>();
        int query = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < query; i++) {
            String name = sc.nextLine();
            int phoneNumber = sc.nextInt();
            sc.nextLine();
            personMap.put(name, phoneNumber);
        }
        
        for (int i = 0; i < query; i++) {
            String searchPerson = sc.nextLine();
            if (personMap.containsKey(searchPerson)) {
                System.out.println(searchPerson + "=" + personMap.get(searchPerson));
            } else {
                System.out.println("Not found");
            }
        }
    }

}
