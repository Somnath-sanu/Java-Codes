//REMOVE DUPLICATES IN UNSORTED LINKED LIST
package LinkedListQuestions;

import java.util.HashSet;

public class Question19 {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static Node removeDup(Node head) {
        // Node p1 = head;
        // Node p2 = p1;
        // while(p1 != null && p1.next != null){
        // while(p2 != null && p2.next != null){
        // if(p2.next.data == p1.data){
        // p2.next = p2.next.next;
        // }
        // else{
        // p2 = p2.next;
        // }
        // }
        // p1 = p1.next;
        // p2 = p1;
        // }

        // return head;

        // if (head == null) {
        // return null;
        // }

        // more optimized code
        Node current = head;
        Node previous = null;
        HashSet<Integer> uniqueValues = new HashSet<>();

        while (current != null) {
            if (uniqueValues.contains(current.data)) {
                // Duplicate found, remove the current node
                previous.next = current.next;
            } else {
                // Add the current value to the set
                uniqueValues.add(current.data);
                previous = current;
            }

            current = current.next;
        }

        return head;

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(11);
        Node d = new Node(11);
        Node e = new Node(12);
        Node f = new Node(11);

        Node g = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        System.out.println("Linked List before removing duplicates : ");

        display(a);
        System.out.println();
        removeDup(a);
        System.out.println("Linked List after removing duplicates : ");
        display(a);

    }
}
