// USING FOR LOOP

package StackQuestions;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] a = { 1, 3,2,1,8,6,3,4 };
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            res[i] = -1;
            // if (i == a.length - 1) {
            //     for (int j = 0; j < i; j++) {
            //         if (a[j] > a[i]) {
            //             res[i] = a[j];
            //             break;
            //         }
            //         else{
            //             res[i] = -1;
            //         }
            //     }
            // }
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    res[i] = a[j];
                    break;
                } 
                // else {
                //     res[i] = -1;
                // }
            }
        }
        // res[a.length -1] = -1;

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
