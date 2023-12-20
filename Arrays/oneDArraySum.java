package Arrays;

import java.util.Arrays;

public class oneDArraySum {
    public static void main(String[] args) {
        // int[]arr = {1,2,3,4};
        // int sum = 0;
        // // for(int i : arr){
        // // sum += i;
        // // }
        // // System.out.println(sum);
        // int[]a = new int[arr.length];
        // int k = 0;
        // // a[0] = arr[0]; //if this output will be 1 1 1 1
        // for(int i : arr){
        // a[k++] = i;
        // }

        // for(int i = 1; i < a.length;i++){
        // a[i] += a[i-1];

        // }
        // for(int i : a){
        // System.out.print(i + " ");
        // }

        // int[][] a = new int[0][];
        // int r = a.length;
        // int c = a[0].length;
        // // if(r > 0){
        // // c = a[0].length;
        // // }

        // System.out.println(r);
        // System.out.println(c);

        int[] a = { 1, 2, 3, 4 };
        // for(int i = 1 ; i < a.length ; i++){
        // a[i] += a[i-1];
        // }
        // int sum = 0;
        // sum += a[a.length-1];
        // System.out.println(sum);

        int[] b = new int[a.length];
        b[0] = a[0];

        //prefix sum 


        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] + a[i];
        }

        System.out.println(a); // [I@372f7a8d    // string representation of the array object
        System.out.println(b); // [I@2f92e0f4

        // When you print an array directly using System.out.println in Java, you're actually printing the default string representation of the array object, not the contents of the array.

        System.out.println(Arrays.toString(a));   //   human-readable string representations 
        System.out.println(Arrays.toString(b));

        int[] c = { 1, 2, 3, 4, 5 };
        int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Printing the contents of a 1D array
        System.out.println(Arrays.toString(c)); // Output: [1, 2, 3, 4, 5]

        // Printing the contents of a 2D array
        for (int[] row : d) {
            System.out.println(Arrays.toString(row));
        }
        // Output:
        // [1, 2, 3]
        // [4, 5, 6]
        // [7, 8, 9]

        System.out.println(Arrays.deepToString(d));
        //Output:
        // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]




        // Note:
        /*
        Arrays.toString() is used to convert the arrays into human-readable string representations before printing.  */

    }
}
