package Stack;

import java.util.Stack;

public class DisplayStackRecurssion {
    public static void displayReverse(Stack<Integer> st){
        if(st.size() == 0) {
            st.push(6);
            return;
        }

        int top = st.pop();
        // System.out.print(top + " ");   // this will print in reverse order  // 5 4 3 2 1
        displayReverse(st);

        System.out.print(top + " ");  // Correct order  // 1 2 3 4 5 
        st.push(top);

    }
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>(); // main stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.size()); // 5 
        System.out.println(st);  // [1, 2, 3, 4, 5]

        displayReverse(st);

        System.out.println();

        System.out.println(st);  // [1, 2, 3, 4, 5]

        System.out.println(st.size()); // 5

    }
}
