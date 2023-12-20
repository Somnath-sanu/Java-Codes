package Arrays.arrays2;

import java.util.Arrays;

public class sortEvenOdd {

    /*First Even then Odd */

    static void sortEven(int[]a){
        int n = a.length;
        int i = 0;
        int j = n -1;
        while(i < j){
            if(a[i]%2 != 0 && a[j]%2 == 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if(a[i]%2==0){
                i++;
            }
            if(a[j]%2 != 0){
                j--;
            }

            
        }

        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[]a = {2,6,5,4,7,1};
        sortEven(a);
    }
}
