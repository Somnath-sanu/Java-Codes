//Merge two Linked list 
//Using extra space

package LinkedListQuestions;

import LinkedListQuestions.Question2.ListNode;

public class Question7 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = new ListNode(1);
        ListNode temp = head;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                ListNode a = new ListNode(temp1.data);
                temp.next = a;
                 temp = a;
                temp1 = temp1.next;
               


            }
            else{
                ListNode a = new ListNode(temp2.data);
                temp.next = a;
                 temp = a;
                temp2 = temp2.next;
               
            }
        }

       if(temp2 == null){
            temp.next = temp1;
           
        }
        else{
            temp.next = temp2;
            
        }

        return head.next;
         
        
    }

    
}
