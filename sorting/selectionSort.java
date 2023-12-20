package sorting;

import java.util.Arrays;

public class selectionSort {

    static void selectionsort(int[]arr){
        int min;
        int temp;
        for(int i = 0 ; i < arr.length ; i++){
            min = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] a = { 5,5, 4,4, 3, 2, 1,8,9,11,2,8,9,1 };
        
        selectionsort(a);
        // for(int i : a){
        // System.out.print(i + " ");
        // }

        System.out.println(Arrays.toString(a));
    }
}
