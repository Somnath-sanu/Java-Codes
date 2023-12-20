package Arrays.arrays2;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(a));

        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));

    }
}
