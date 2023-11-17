// sort 0s 1s 2s element
//Best approach

package LinkedListQuestions;

public class Question20 {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node segregate(Node head) {
        Node zero = new Node(-1);
        Node z = zero;
        Node one = new Node(-1);
        Node o = one;
        Node two = new Node(-1);
        Node t = two;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                z.next = temp;
                z = temp;

            }
            if (temp.data == 1) {
                o.next = temp;
                o = temp;

            }
            if (temp.data == 2) {
                t.next = temp;
                t = temp;

            }
            temp = temp.next;
        }
        // z.next = null;
        // o.next = null;
        // t.next = null;

        if (one.next != null) {
            z.next = one.next;
        } else {
            z.next = two.next;
        }

        o.next = two.next;
        t.next = null;
        // z.next = one.next;

        return zero.next;

    }

}
