package LinkedListQuestions;

public class addTwoLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node add(Node l1 , Node l2){
        int carry = 0;
        Node dummy = new Node(0);
        Node temp = dummy;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            Node node = new Node(sum % 10);
            temp.next = node;
            temp = temp.next;
            carry = sum / 10;

        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node f = new Node(2);
        Node g = new Node(4);
        Node h = new Node(6);
        Node i = new Node(8);
       
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;

        Node ans = add(a, f);

        Node t = ans;
        while(t != null){
            System.out.print( t.data + " ");
            t = t.next;
        }
        


    }
    
}
