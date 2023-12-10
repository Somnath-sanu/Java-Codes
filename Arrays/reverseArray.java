
package Arrays;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,6}};
        display(matrix);
        System.out.println();
        for(int i = 0; i < matrix.length;i++){
            // int[]a = matrix[i];
            int[]a = Arrays.copyOf(matrix[i] , matrix[i].length);
            
            int j = 0 ; int k = a.length -1;
            while(j < k){
                int temp = a[j];
                a[j] = a[k];
                a[k] = temp;
                j++;
                k--;
            }

            for(int z = 0; z < a.length;z++){
                System.out.print(a[z]  + " ");
            }
            System.out.println();
        }
        System.out.println();
        display(matrix);

        System.out.println();

        for(int i = 0; i < matrix.length;i++){
            for(int j= 0; j < matrix[i].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j] = temp;
            }
        }

        display(matrix);
    }
    public static  void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
