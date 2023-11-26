package StackQuestions;

import java.util.Stack;

public class removeConsecutiveSubsequences {

    public static int[] remove(int[] arr){

        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(st.size()==0 || st.peek() != arr[i]) st.push(arr[i]);
            else if( i >= n-1 || arr[i] != arr[i+1]){
                st.pop();
            }



        }

        int[] ans = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }

        return ans;

        
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int [] res = remove(arr);

        for(int val : res){
            System.out.print(val + " "); // 1 3 5 2 

        }
    }
}
