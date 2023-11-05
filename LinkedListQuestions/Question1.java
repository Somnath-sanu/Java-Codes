//Removing Nth Node from the end of Linked List

package LinkedListQuestions;



public class Question1 {

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    static Node removeNode(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        

        if (fast == null) {
            head = head.next;
            
            return head;
        }
        



        while(fast.next != null){ // one ahead to remove last node IMPORTANT
        slow = slow.next;
        fast = fast.next;

        }

       

        

        slow.next = slow.next.next;
        return head;

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node h = removeNode(a, 4);
        display(h);

    }
}
