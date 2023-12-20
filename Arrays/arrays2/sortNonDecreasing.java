package Arrays.arrays2;

import java.util.Arrays;

/*Given an integer array 'a' sorted in non decreasing order, return an array of the squares of each number sorted in  non-decreasing order */

public class sortNonDecreasing {

    static void reverse(int[]a){
        int n = a.length;
        int i = 0;
        int j = n -1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }


    static int[] swapSquares(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n -1;
        int[]ans = new int[n];
        int k = 0;  // it will use to traverse on ans array

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[]a = {-10,-3,-2,1,4};
        int[]b = {2,4,6,7,10};
        int[]ans = swapSquares(a);
        reverse(ans);

        System.out.println(Arrays.toString(ans));
        
    }
}
