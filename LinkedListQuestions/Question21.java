package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question21 {
    class Solution {

        // MERGE SORT

        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;

            // step 1. cut the list to two halves
            ListNode slow = head, fast = head;

            while (fast.next.next != null && fast.next.next.next != null) {
                // prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode after = slow.next;
            slow.next = null;

            // step 2. sort each half
            ListNode l1 = sortList(head);
            ListNode l2 = sortList(after);

            // step 3. merge l1 and l2
            ListNode n = merge(l1, l2);
            return n;

        }

        ListNode merge(ListNode l1, ListNode l2) {
            ListNode l = new ListNode(0);
            ListNode p = l;

            while (l1 != null && l2 != null) {
                if (l1.data < l2.data) {
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next; // Move p to the next node
            }

            if (l1 != null) {
                p.next = l1;
            }
            if (l2 != null) {
                p.next = l2;
            }

            return l.next;
        }
    }
}
