//COPY of MAIN STACK

package Stack;

import java.util.Stack;

public class copy {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>(); // main stack
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println("st stack :" +st); // st stack :[5, 10, 15, 20, 25]
        // System.out.println(st.size());
        Stack<Integer>gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        // reverse order
        System.out.println("gt stack :" + gt);  // gt stack :[25, 20, 15, 10, 5]
        Stack<Integer>pt = new Stack<>();
        while(gt.size()>0){
            pt.push(gt.pop());
        }

        System.out.println("Copy stack :" + pt);  // Copy stack :[5, 10, 15, 20, 25]
        

        

        System.out.println(st.size());  //0
        System.out.println(gt.size());  //0
        System.out.println(pt.size());  //5
    }
}
