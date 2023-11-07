//Finding Middle Element of Linked List
//Leetcode

//in one traversal // WITHOUT KNOWING THE SIZE OF LINKED-LIST

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question3 {
     public ListNode middleNode(ListNode head) {

        // ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        // int size = 0;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
       
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }
        
        
            

        

        return slow;
        
    }
    
}
