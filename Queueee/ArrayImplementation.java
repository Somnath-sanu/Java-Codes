package Queueee;

import LinkedListQuestions.sortLL;

public class ArrayImplementation {
    public static class  queue1 {

        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];

        void add(int n){
            if(r == arr.length-1){
                System.out.println("Queue is full!");
                return;
            }

            if(f==-1){
                 f =  r = 0;
                 arr[0] = n;
            }
            else{
                arr[r+1] = n;
                r++;
            }

            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i = f ; i <=r;i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();

        }


    
        
    }
    public static void main(String[] args) {
       queue1 q = new queue1();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.display();
       System.out.println(q.remove());
       System.out.println(q.remove());
       System.out.println(q.remove());
       System.out.println(q.remove());
       System.out.println(q.remove());
       q.display();
       System.out.println(q.remove());
       System.out.println(q.peek());
       System.out.println(q.size);
    }
}
