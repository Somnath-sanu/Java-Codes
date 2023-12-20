package sorting;

import java.util.Arrays;

public class mergeSort {

    static void merge(int[] a, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = a[low + i]; // low is not always zero;

        }
        for (j = 0; j < n2; j++)
            right[j] = a[mid + 1 + j];
        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) {
            if(left[i] < right[j]){ 
                a[k++] = left[i++];
            }
            else{
                a[k++] = right[j++];
            }
            
        }

        while(i < n1){
            a[k++] = left[i++];
        }
        while(j < n2){
            a[k++] = right[j++];
        }

    }

    static void mergesort(int[] a, int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;
        
        mergesort(a, low, mid);
        mergesort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void main(String[] args) {
        int[] a = { 5,5, 4,4, 3, 2, 1,8,9,11,2,8,9,1 };
        int low = 0;
        int high = a.length - 1;
        mergesort(a, low, high);
        // for(int i : a){
        // System.out.print(i + " ");
        // }

        System.out.println(Arrays.toString(a));

    }
}
