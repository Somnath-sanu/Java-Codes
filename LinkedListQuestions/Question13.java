//REVERSE LINKEDLIST  USING WITHOUT RECURSSION

// code order is important

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question13 {

     public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr= after;


        }

        // curr -> null

        return prev;
        
    }
    
}
