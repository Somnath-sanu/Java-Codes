//For a given matrix 'a' of dimension nxm and coordinates (l1, r1) to (l2, r2), return the sum of rectangle from (l1, r1) to (l2, r2)

package Arrays;

import java.util.Scanner;

public class prefixSum {

    public static int findSum(int[][] a, int r1, int c1, int r2, int c2) {
        if (r1 < 0 || r2 >= a.length || c1 < 0 || c2 >= a[0].length ||
                r1 > r2 || c1 > c2)
            return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {

                sum += a[i][j];
            }

        }

        return sum;
    }

    public static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // for our third approach we have to find column wise prefix sum as well

        /* traverse vertically to calculate column-wise prefix sum */


        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }

    }

    public static int findSum2(int[][] a, int r1, int c1, int r2, int c2) {
        int sum = 0;
        findPrefixSumMatrix(a);

        for (int i = r1; i <= r2; i++) {
            // c1 to c2 sum for row i

            // sum += a[i][c2] - a[i][c1-1];

            // one problem
            // what if c1 == 0; then c1 -1 will try to access negative index so error
            // to avoid that

            if (c1 > 0) {
                sum += a[i][c2] - a[i][c1 - 1];
            } else {
                sum += a[i][c2];
            }

        }

        return sum;
    }

    public static int findSum3(int[][] a, int r1, int c1, int r2, int c2) {

        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        findPrefixSumMatrix(a);
        sum = a[r2][c2];
        if (r1 > 0) {
            up = a[r1 - 1][c2];
        }
        if (c1 > 0) {
            left = a[r2][c1 - 1];
        }
        if (r1 > 0 && c1 > 0) {
            leftup = a[r1 - 1][c1 - 1];
        }

        ans = sum - up - left + leftup;

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

        System.out.println(" Sum is " + findSum(arr, r1, c1, r2, c2));
        // System.out.println(" Sum is " + findSum2(arr, r1, c1, r2, c2));
        System.out.println(" Sum is " + findSum3(arr, r1, c1, r2, c2));
    }
}