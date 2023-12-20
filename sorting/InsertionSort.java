package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[]a){
        int temp;
        int n = a.length;
        for(int i = 1 ; i < n ; i++){
            int j = i;
            while ( j > 0 && a[j] < a[j-1]) {
                temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;


            }
        }
    }
    public static void main(String[] args) {
        int[] a = { 5,5, 4,4, 3, 2, 1,8,9,11,2,8,9,1 };
        
        insertionSort(a);
        // for(int i : a){
        // System.out.print(i + " ");
        // }

        System.out.println(Arrays.toString(a));
    }
}
