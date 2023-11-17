//REMOVE DUPLICATES 

package LinkedListQuestions;

public class Question18 {

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

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(4);

        Node g = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;

        display(a);
        System.out.println();

        Node dummy = new Node(500);
        dummy.next = a;
        Node prev = dummy;
        Node curr = a;
        while (curr != null && curr.next != null) {
            while (curr != null && curr.next != null && prev.next.val == curr.next.val) {
                curr = curr.next;

            }

            if (prev.next == curr) {
                prev = prev.next;
            } else {
                prev.next = curr.next;
                curr = curr.next;
                // prev = curr;

            }

        }

        display(dummy.next);

        Node dummy2 = new Node(-1);
        Node t1 = dummy2;
        Node t2 = a;
        while (t2 != null) {
            // if(t1.val == t2.val){
            // t2 = t2.next;
            // }
            // else{
            // t1.next = t2;
            // t2 = t2.next;
            // t1 = t1.next;
            // }

            if (t1.val != t2.val) {
                if (t1.next == t2) {
                    t1 = t1.next;
                    // t2 = t2.next;
                } else {
                    t1.next = t2;

                }
            } else {
                t2 = t2.next;
            }
        }

        t1.next = null;

        System.out.println();

        display(dummy2.next);

    }

}
