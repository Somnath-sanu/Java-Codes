//REMOVE DUPLICATES FROM SORTED LIST

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question9 {

     public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode h = new ListNode(301);
        ListNode a = h;
        while(temp != null){
            if( temp.data == a.data ){
               
            
                temp = temp.next;
            }
            else{
                
                a.next = temp;
                a = temp;

               temp = temp.next;
            }

        }
        a.next = null;
        return h.next;
     }

     //2nd METHOD

      public ListNode deleteDuplicate(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
            
        }

        return head;
     }
}
