package HackerRank;

import java.util.*;

public class javaList {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();

        for (int i = 0; i < query; i++) {
            arrList.add(sc.nextInt());
        }
        int op = sc.nextInt();
        for (int i = 0; i < op; i++) {
            sc.nextLine();
            String inDel = sc.nextLine().toLowerCase();
            if (inDel.equalsIgnoreCase("insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                arrList.add(x, y);

            }
            if (inDel.equalsIgnoreCase("delete")) {
                int z = sc.nextInt();
                arrList.remove(z);
            }
        }

        for (int i : arrList) {
            System.out.print(i + " ");
        }
    }

}
