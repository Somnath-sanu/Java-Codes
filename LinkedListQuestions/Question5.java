//Cycle in a Linked list

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question5 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(head == null || head.next == null) return false; // no cycle

        while(fast != null){
            if(slow == null) return false; // no cycle
            if(fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ) return true;
        }

        return false;
        
    }
}
