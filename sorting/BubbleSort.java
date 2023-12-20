package sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[]a){
        int temp;
        int n = a.length;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n - 1 ; j++){
                if(a[j+1] < a[j]){ // n + 1 so loop will iterete upto n -1;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
     public static void main(String[] args) {
        int[] a = { 5,5, 4,4, 3, 2, 1,8,9,11,2,8,9,1 };
        
        bubbleSort(a);
        // for(int i : a){
        // System.out.print(i + " ");
        // }

        System.out.println(Arrays.toString(a));
    }
}
