//REVERSE LINKEDLIST  USING RECURSSION

package LinkedListQuestions;

public class Question12 {

    public static class Node {
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

    public static Node reverse(Node head) {

        if (head.next == null)
            return head;

        Node newHead = reverse(head.next);
        head.next.next = head; // Interchanging the connections
        head.next = null; // important
        // System.out.println(head.val);

        return newHead;

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
        Node newHead = reverse(a);
        // System.out.println(newHead.val); // 15
        display(newHead);

    }

}
