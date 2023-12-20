//The time complexity of this solution is O(n), 
//The space complexity of this solution is O(1) 

package Arrays.arrays2;

import java.util.Arrays;

public class rotateByK2 {

    static void swap(int[]arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7};
        int k = 3;


        int n = a.length;
        k = k % n;
        swap(a, 0, n-k-1);
        swap(a, n-k, n-1);
        swap(a, 0, n-1);



        
        System.out.println(Arrays.toString(a));
    }
}
