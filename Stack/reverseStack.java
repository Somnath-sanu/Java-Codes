package Stack;

import java.util.Stack;

public class reverseStack {

    static void pushAtBottom(Stack<Integer> st , int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    static void reverse(Stack<Integer> st) {
        if(st.size() == 0) return;

        int top = st.pop();
        // System.out.print(top + " ");     // i am not reversing it  ,  just displaying it in reverse
        reverse(st);
        // st.push(top);

        pushAtBottom(st, top);
        

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); // main stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        reverse(st);
        
        System.out.println(st);
    }
}
