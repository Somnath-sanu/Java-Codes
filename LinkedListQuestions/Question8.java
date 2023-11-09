//Merge two Linked list 
//Without Using extra space

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question8 {

    // we can use a function to find min value as well

    public int min(int x , int y){
        return x < y ? x : y ;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode head = new ListNode(100);
        ListNode a = head;

        while(t1 != null && t2 != null){
            // int b = min(t1.data , t2.data);
            if(t1.data < t2.data){
                a.next = t1;
                a = t1;
                t1 = t1.next;
            }
            else{
                a.next = t2;
                a = t2;
                t2 = t2.next;
            }
            
        }

        if(t1 == null){
            a.next = t2;
        }
        else{
            a.next = t1;
        }

        return head.next;

    }
}
