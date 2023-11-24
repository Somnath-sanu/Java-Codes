package LinkedListQuestions;

public class sortLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node sort(Node head){
        if(head == null && head.next == null) return head;

        // find middle

        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node after = slow.next;
        slow.next = null;

        // sort each half
    }


    public static void main(String[] args) {
        Node a = new Node(15);
        Node b = new Node(6);
        Node c = new Node(70);
        Node d = new Node(8);
        Node e = new Node(19);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node ans = sort(a);

        Node t = ans;
        while(t != null){
            System.out.print( t.data + " ");
            t = t.next;
        }
    }
}
