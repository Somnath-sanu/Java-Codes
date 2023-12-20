//The time complexity of this solution is O(n), where n is the length of the input array
//The space complexity of this solution is O(n), where n is the length of the input array. 

package Arrays.arrays2;


import java.util.Arrays;

public class rotateByK {
    static int[] rotate(int[]arr , int k){
        int n = arr.length; 
        k = k % n;

        // those two steps are important...

        int[]ans = new int[n];
        int j = 0;
        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k;i++){
            ans[j++] = arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7};
        int k = 3;
        int[]x = rotate(a, k);
        System.out.println(Arrays.toString(x));

    }
}
