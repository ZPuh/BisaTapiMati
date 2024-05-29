package Kyu7.FunWithLists_AnyMatch_AllMatch;

import java.util.function.Predicate;

class Solution {

    public static void main(String[] args) {

        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node2 = new Node<>(2, node3);
        Node<Integer> node1 = new Node<>(1, node2);

        Predicate<Integer> predicate = x -> x > 1;

        System.out.println(anyMatch(node1, predicate)); // Output: true
        System.out.println(allMatch(node1, predicate)); // Output: false
    }

    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            if (!p.test(head.data)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            if (p.test(head.data)) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
