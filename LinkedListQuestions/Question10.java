// ODD EVEN

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question10 {

    public ListNode oddEvenList(ListNode head) {
        ListNode t = head;//1
        ListNode odd = new ListNode(1);
        ListNode o = odd;
        ListNode even = new ListNode(100);
        ListNode e = even;
        while(t != null){
            if(t.data %2 != 0){ //ODD
                ListNode b = new ListNode(t.data);
                o.next = b;
                o = b;
                t = t.next;

            }else{//even
                ListNode b = new ListNode(t.data);
                e.next = b;
                e = b;
                t = t.next;
            }

              
               

        }
        // o.next = even.next;
        // return odd.next;

        o.next = even.next;
        return odd.next;
    }


    
}
