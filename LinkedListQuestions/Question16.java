// Making deep copy of linked list

package LinkedListQuestions;

public class Question16 {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {

        if (head == null)
            return;

        System.out.print(head.val + " ");
        display(head.next);
        // System.out.print(head.val + " ");

        // this will print reverse linked list but we have to change connections
        // as well

    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(12);
        Node e = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // System.out.println(a.val); // 3

        display(a);
        System.out.println();
        // Making deep copy
        Node temp1 = a;
        Node h = new Node(0);
        Node temp2 = h;
        // h.next = a; // one way to do so.........AMAZING
        while (temp1 != null) {
            // Node in = new Node(temp1.val);
            temp2.next = temp1;
            temp2 = temp2.next; // or temp2 = temp1;
            temp1 = temp1.next;
        }

        display(h.next);

    }
}
