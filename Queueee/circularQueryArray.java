package Queueee;

public class circularQueryArray {

    public static class Cqueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[3];

        void add(int v) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full");

            }

            else if (size == 0) {
                front = rear = 0;
                arr[0] = v;

            } else if (rear < arr.length - 1) {
                arr[++rear] = v;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = v;
            }

            size++;
        }

        int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!!!");
            }

            else {
                int val = arr[front];
                if (front == arr.length - 1)
                    front = 0;
                 else{
                     front++;
                 }   
                 size--;
                return val;
            }
        }

        int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!!!");
            } else
                return arr[front];

        }

        void display(){
            if(size==0){
                System.out.println("Queue is Empty!!");
                return;
            }
            else if(front <= rear){
                for(int i = front;i<=rear;i++){
                    System.out.print(arr[i] + " ");
                }

            }
            else{ // rear < front
                for(int i =front;i < arr.length ; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i <= rear;i++){
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqueue q = new Cqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        q.display(); // 1 2 3
        q.remove(); //    2 3
        q.add(4); //  4 2 3 (in array in will be like that)
        q.display();//  2 3 4
        // q.add(5); // Queue is Full
        for(int i = 0 ; i<q.arr.length;i++){
            System.out.print(q.arr[i] + " "); // 4 2 3
        }
    }
}
