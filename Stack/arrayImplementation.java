// Array implementation of Stack

package Stack;

public class arrayImplementation {
    public static class Stack {
        private int[] arr = new int[50];
        private int idx = 0;

        void push(int a) {
            if(isFull()){
                System.out.println("Stack is Full!!!");
                return;
            }
            arr[idx] = a;
            idx++;

        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx -1];
        }
        void display(){
            for(int j = 0 ; j < idx; j++){
                // if(arr[j] == 0) continue; // i forget to decrement idx
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx -1];
            arr[idx - 1] = 0;
            idx--;
            return top;

        }
        Boolean isFull(){
            if (idx == arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);

        st.display(); // 4 5 1
        
        System.out.println(st.size()); // 3

        // System.out.println(st.pop()); // 1
        
        
        st.display(); // 4 5
        
        System.out.println(st.peek());

        st.push(4);
        st.push(8);
        st.display();  //4 5 1 4 8
        st.push(10);  //  Stack is Full!!!
        System.out.println(st.capacity()); // 50
       

    }

}
