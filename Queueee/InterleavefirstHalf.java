//Using stack

package Queueee;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class InterleavefirstHalf {

    static void interLeaveQueue(Queue<Integer> q){
        Stack<Integer>st = new Stack<>();
        int l = q.size() / 2;
        for(int i = 0; i < l ; i++){
            st.push(q.remove());
        }

        while(st.size() > 0){
            q.add(st.pop());
        }

        for(int i = 0; i < l ; i++){
            st.push(q.remove());
        }

        while(st.size() > 0){
            q.add(st.pop());
            q.add(q.remove());
        }

        // Reverse queue
        while(q.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        interLeaveQueue(q);
        int length = q.size(); // Important , can't use directly q.size() cause its changing
        
        for (int i = 0; i < length ; i++) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        // 11 16 12 17 13 18 14 19 15 20 
    }
}
