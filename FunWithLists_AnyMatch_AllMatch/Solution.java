package Kyu7.FunWithLists_AnyMatch_AllMatch;

import java.util.function.Predicate;

class Solution {

    /*
Soal ini meminta kita untuk mengimplementasikan dua metode pada linked list, yaitu anyMatch dan allMatch, 
yang memeriksa elemen-elemen dari linked list berdasarkan suatu predicate (fungsi yang mengembalikan nilai boolean).

Mari kita bahas secara rinci:

anyMatch:
Tujuan: Mengecek apakah ada setidaknya satu elemen dalam linked list yang memenuhi predicate.
Hasil: Mengembalikan true jika ada minimal satu elemen yang memenuhi predicate, dan false jika tidak ada elemen yang memenuhi predicate.
    
allMatch:
Tujuan: Mengecek apakah semua elemen dalam linked list memenuhi predicate.
Hasil: Mengembalikan true jika semua elemen memenuhi predicate, dan false jika ada satu atau lebih elemen yang tidak memenuhi predicate.
    
Contoh:
Linked list: 1 -> 2 -> 3
Predicate: x => x > 1

anyMatch:
Memeriksa elemen satu per satu:
1 > 1 (false)
2 > 1 (true) -> Mengembalikan true karena ada setidaknya satu elemen yang memenuhi predicate.
Hasil: true
    
allMatch:
Memeriksa elemen satu per satu:
1 > 1 (false) -> Mengembalikan false karena ada elemen yang tidak memenuhi predicate.
Hasil: false    
     */

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
