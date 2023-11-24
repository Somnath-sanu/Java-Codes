package Stack;

import java.util.Stack;

public class InsertionStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>(); // main stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int idx = 3;
        int x = 7;

         Stack<Integer>gt = new Stack<>();

        while(st.size() > idx){
            gt.push(st.pop());

        }
        st.push(x);
        while(gt.size() > 0){
            st.push(gt.pop());
        }

        System.out.println(st);

    }
}
