package Arrays.arrays2;

import java.util.Arrays;

public class findSuffixSum {
    public static void main(String[] args) {
        int a[] = {2,5,6,1,3};
        System.out.println("Original Array "+ Arrays.toString(a)); // [2, 5, 6, 1, 3]

        for(int i = a.length - 2 ; i >= 0 ; i-- ){
            a[i] += a[i+1];
        }

        System.out.println("Suffix Sum " + Arrays.toString(a)); //   [17, 15, 10, 4, 3]
    }
}
