//Finding Intersection of two linked lists 
//Leetcode

package LinkedListQuestions;

public class Question2 {


    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(tempA != null){
            sizeA ++;
            tempA = tempA.next;
        }
       
       
        while(tempB != null){
            sizeB ++;
            tempB = tempB.next;
        }

         tempA = headA;
         tempB = headB;


       if(sizeA > sizeB){
          
           int steps =  sizeA - sizeB;
           for(int i = 1; i <=steps; i++){
               tempA = tempA.next;

            }
          

        }
       else{
          
           int steps =  sizeB - sizeA;
           for(int i = 1; i <= steps; i++){
               tempB = tempB.next;

            }
          


        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;

        }

        return tempA;
    }

    public static void main(String[] args) {
       

    }

}
