package LinkedListQuestions;

public class sortLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node MergeList(Node l1 , Node l2){
        Node l = new Node(0);
        Node p = l;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        if(l1 != null){
            p.next = l1;
        }
         if(l2 != null){
            p.next = l2;
        }

        return l.next;
    }

    public static Node sort(Node head){
        if(head == null && head.next == null) return head;

        // find middle

        Node slow = head;
        Node fast = head;
        if(fast.next == null) return head; // THIS LINE IS NO NEED IN LEETCODE  
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node after = slow.next;
        slow.next = null;

        // sort each half

        Node l1 = sort(head);
        Node l2 = sort(after);

        //Merge l1 and l2

        Node n = MergeList(l1,l2);
        return n ;

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
