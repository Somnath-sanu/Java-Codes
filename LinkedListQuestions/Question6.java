//Cycle in a Linked list 2
//return node where the cycle begins

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question6 {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        if(head == null || head.next == null) return null;

        while(fast!=null){
            
            slow = slow.next;
            if(fast.next == null) break;
           
            fast = fast.next.next;
            if(slow == fast) break;
        }
        ListNode temp = head;
        while(temp != slow){
            if(slow == null) break;
            temp = temp.next;
            slow = slow.next;
        }

        return slow; // each line is just at perfect place...
        
    }
    
}
