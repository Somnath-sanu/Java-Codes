package LinkedListQuestions;



public class rotateLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node rotateRight(Node head, int k) {
        
        

        

        if (head == null || head.next == null)  return head;
           

        Node curr = null;

        

        Node temp = head;

        while (k != 0) {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            curr = temp.next;
            curr.next = head;
            temp.next = null;
            temp = head;
            head = curr;
            k--;

        }
      


        return head;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node ans = rotateRight(a, 2);

        Node t = ans;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}