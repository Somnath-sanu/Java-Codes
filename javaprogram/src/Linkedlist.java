public class Linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;

        }

        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if (idx == 0) {
                insertAtHead(data);
                return;
            }
            if (idx == size()) {
                insertAtEnd(data);
                return;
            }

            if (idx < 0 || idx > size()) {
                System.out.println("Wrong index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;

            }

            t.next = temp.next;
            temp.next = t;
        }

        void deleteAt(int idx) {
            if (idx < 0 || idx > size() - 1) {
                System.out.println("Wrong index");
                return;
            }
            Node temp = head;

            if (idx == 0) {
                head = head.next;
                return;

            }

            for (int i = 1; i < idx; i++) {
                temp = temp.next; // not temp = head.next
            }
            if (idx == size() - 1) {
                tail = temp;
            }

            temp.next = temp.next.next;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4);// 4
        ll.insertAtEnd(5); // 4 -> 5
        ll.insertAtEnd(6); // 4 -> 5 -> 6
        ll.display();
        // System.out.println(ll.size());
        System.out.println();
        ll.insertAtHead(9);
        ll.display();
        System.out.println();
        // ll.insertAt(5,8); // 9 8 4 5 6
        // ll.display();
        // System.out.println(ll.tail.data);
        ll.deleteAt(2);
        ll.display();
        // System.out.println(ll.tail.data);
        System.out.println();
        // System.out.println(ll.head.data);

    }

}
