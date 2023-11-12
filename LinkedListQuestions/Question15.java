//Maximum twin Sum of a Linked List

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question15 {
     public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

       
        slow.next = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = slow.next;
        int maxSum = 0;
        while(p2 != null){
            int sum = p1.data + p2.data;
            if(sum > maxSum){
                maxSum = sum;
            }
            p1 = p1.next;
            p2 = p2.next;


        
        }

        return maxSum;
        
    }
}
