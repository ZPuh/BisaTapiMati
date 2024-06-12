import java.util.*;

public class ArrayListtt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < q; j++) {
                list.add(sc.nextInt());
            }
            arrList.add(list);
        }

        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (x < arrList.size() && y < arrList.get(x).size()) {
                System.out.println(arrList.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }

        }
    }
}
