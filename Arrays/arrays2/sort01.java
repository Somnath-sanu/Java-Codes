package Arrays.arrays2;

import java.util.Arrays;

public class sort01 {
    static int[] sort(int[] a) {

        //not efficient approach 


        int n = a.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }

        return a;
    }

    static void sort2(int[] a) {
        // Two pointer approach

        int n = a.length;
        int i = 0;
        int j = n-1;
        while (i < j) {
            if(a[i]==1 && a[j]==0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if(a[i]==0){
                i++;
            }
            if(a[j]==1){
                j--;
            }
            
        }

        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 0, 0,1,0,0,1,1,1,0 };
        // int[] ans = sort(a);
        sort2(a);

        // System.out.println(Arrays.toString(ans));

    }
}
