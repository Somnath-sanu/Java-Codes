package Queueee;

public class LinkedListImplementation {

    

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {

        Node head = new Node(-1);
        Node tail = head;
        int size = 0;

        void add(int v) {
            if (size == 0) {
                head.val = v;

            } else {
                Node temp = new Node(v);
                tail.next = temp;
                tail = tail.next;
                
            }

            size++;
        }

        int remove(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            Node temp = head;
            head = head.next;
            size --;
            return temp.val;
        }

        int peek(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node t = head;
            while (t != null) {
                System.out.print(t.val + " ");
                t = t.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        queueLL q = new queueLL();

        q.add(5);
        q.add(10);
        q.add(15);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        
        System.out.println(q.peek());
    }
}
