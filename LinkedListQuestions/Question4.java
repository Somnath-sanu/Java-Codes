//Delete the middle element of linked list
//in one traversal

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question4 {

    public ListNode deleteMiddle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        slow.next = slow.next.next;
        return head;

    }

}
