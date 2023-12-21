// Method 3 
// row wise and column wise prefix sum

package Arrays.arrays2;

import java.util.Scanner;

public class prefixSum2 {

    static void findPrefixSum(int[][]a){
        int r = a.length;
        int c = a[0].length;

        // row wise prefix sum
        for(int i = 0 ; i < r ; i++){
            for(int j = 1 ; j < c ; j++){
                a[i][j] += a[i][j-1];
            }
        }

        //column wise prefix sum
        for(int j = 0 ; j < c ; j++){
            for(int i = 1 ; i < r ; i++){
                a[i][j] += a[i-1][j];
            }
        }
    }

    static int findSum(int[][]a , int r1 , int c1 , int r2 , int c2){
        int totalSum = 0 ; int leftSum = 0 ; int upSum = 0 ; int leftUpSum = 0 ; 
        findPrefixSum(a);
        totalSum = a[r2][c2];

        if(c1 > 0){
            leftSum = a[r2][c1-1];
        }
        if(r1 > 0){
            upSum = a[r1-1][c2];
        }
        if(r1 > 0 && c1 > 0){
            leftUpSum = a[r1-1][c1-1];
        }

        int ans = totalSum - upSum - leftSum + leftUpSum;

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of array:");
        int r = sc.nextInt();
        System.out.println("Enter the column of array:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " elements of array : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Cordinates r1 c1 r2 c2 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("Sum is " + findSum(arr, r1, c1, r2, c2));

        sc.close();
    }
}
