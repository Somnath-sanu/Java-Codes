// ODD EVEN INDEX(1 , 2 , 3 ,...)

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question11 {

    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempOdd = odd;
        ListNode tempEven = even;

        while(temp != null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            

            tempEven.next = temp; // so that it coonected to null
            if(temp==null) break;
            temp = temp.next;
            tempEven = tempEven.next;

        }

        even = even.next;
        odd = odd.next;

        tempOdd.next = even;

        return odd;
        
        
        
        
    }

    
}
