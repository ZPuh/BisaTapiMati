package HackerRank;

import java.util.*;

public class JavaStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> st = new Stack();
            boolean cek = true;
            for (char in : input.toCharArray()) {
                if (in == '(' || in == '{' || in == '[') {
                    st.push(in);
                } else if ((in == ')' || in == '}' || in == ']')) {
                    if (st.isEmpty()) {
                        cek = false;
                        break;
                    }
                    char pucuk = st.pop();
                    if ((pucuk == '(' && in == ')') || (pucuk == '[' && in == ']') || (pucuk == '{' && in == '}')) {
                        cek = true;
                    }
                }
            }
            if (!st.isEmpty()) {
                cek = false;
            }
            System.out.println(cek);
        }
    }
}
