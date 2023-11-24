// In order to make the output same i made a code little messy 😁 Hope you understand

package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); // main stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st); // [1, 2, 3, 4, 5]


        // APPROACH - 1
        

        // Stack<Integer>gt = new Stack<>();
        // while(st.size() > 0){
        // gt.push(st.pop());

        // }

        // // System.out.println(gt); // [5, 4, 3, 2, 1]

        // System.out.print("[");

        // while(gt.size() >0){
        // int x = gt.pop();

        // if(gt.size() == 0){
        // System.out.print( x);
        // System.out.print("]"); // [1, 2, 3, 4, 5]
        // return;
        // }

        // System.out.print( x + ", " ); // [1, 2, 3, 4,

        // st.push(x);
        // }


        // Approach 2


        int n = st.size();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { // we cant use st.size() in place of n as its also changing
            arr[i] = st.pop();
        }

        // for(int i : arr){
        // System.out.print( i + " ");
        // }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

        System.out.println();
        System.out.println(st);

    }
}
