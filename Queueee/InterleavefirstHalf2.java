// Using Queue

package Queueee;

import java.util.LinkedList;
import java.util.Queue;

public class InterleavefirstHalf2 {

    static void interLeaveQueue(Queue<Integer> q){
        Queue<Integer> Q = new LinkedList<>();
        int l = q.size()/2;

        for(int i = 0; i < l;i++){
            Q.add(q.remove());
        }

        while(Q.size() > 0){
            q.add(Q.remove());
            q.add(q.remove());
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
