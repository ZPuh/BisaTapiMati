package M1;

public class Latihan2 {

    public static void main(String[] args) {
        // Menghapus Node Tertentu dari Linked List
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(6);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);
        node.next.next.next.next.next = new Node(5);
        node.next.next.next.next.next.next = new Node(6);

        // element yang akan dihapus
        int delete = 6;

        Node nodeBaru = hapusElementNode(node, delete);
        printNode(nodeBaru);
    }

    static Node hapusElementNode(Node node, int d) {
        Node hasil = new Node(0);
        hasil.next = node;

        Node sementara = hasil;

        while (sementara.next != null) {
            if (sementara.next.val == d) {
                sementara.next = sementara.next.next;
            } else {
                sementara = sementara.next;
            }
        }
        return hasil.next;
    }

    static void printNode(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}

class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

}
