//USING STACK
package StackQuestions;

import java.util.Stack;

public class nextGreaterElement2 {
    public static void main(String[] args) {
        int[] a = { 1, 3,2,1,8,6,3,4 };
        
        int n = a.length;
        int[]res = new int[n]; // Not (n-1) size
        Stack<Integer>st = new Stack<>();
        
        st.push(a[n-1]);
        res[n-1] = -1;
        for(int i = n-1;i>=0;i--){
            while(st.size() > 0 && st.peek() <= a[i]  ){
                st.pop();

            }
            if(st.size() == 0) res[i] = -1;
            else{
                res[i] = st.peek();
                

            }
            st.push(a[i]);
            

        }

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
