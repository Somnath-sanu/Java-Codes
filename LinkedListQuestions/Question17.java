// Copy List with Random pointer
//IMPORTANT

package LinkedListQuestions;

// Definition for a Node.

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Question17 {

    public Node copyRandomList(Node head) {
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;

        // creating deep copy
        while (temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;

        }

        head2 = head2.next; // copy ready
        temp2 = head2;
        temp1 = head;

        // Alternate connections
        Node temp = new Node(-1);
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp = temp2;
            temp2 = temp2.next;
        }

        temp2 = head2;
        temp1 = head;

        // assigning random pointers
        while (temp1 != null) {
            if (temp1.random == null)
                temp2.random = null;
            else
                temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if (temp1 != null)
                temp2 = temp1.next;
        }
        temp2 = head2;
        temp1 = head;

        // separating the lists

        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;

            if (temp1 == null)
                break;

            temp2.next = temp1.next;
            if (temp2 == null) break;
                
            temp2 = temp2.next;
        }

        return head2;

    }

}
