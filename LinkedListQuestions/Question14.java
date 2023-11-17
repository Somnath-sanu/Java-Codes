//PALINDROME OR NOT

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question14 {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow.next);
        slow.next = temp;// important
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while (p2 != null) { // p1 != slow (dont use -> error)
            if (p1.data != p2.data)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;

    }
}
