package Stack;

public class linkedListImplementation {
    public static class Node {  // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class LLStack{ // user defined data structure
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;

            size++;
        }


        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.val;
        }

        void displayrec(Node h){
            if(h==null) return;
            
            displayrec(h.next);

            System.out.print(h.val + " ");
            

            

        }


        void display(){ // display method
           displayrec(head);
           System.out.println();
        }


        int size(){
            return size;
        }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());       
        System.out.println(st.pop());
        st.display();





    }
}
