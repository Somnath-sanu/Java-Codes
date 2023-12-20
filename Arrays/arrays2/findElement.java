package Arrays.arrays2;

import java.util.Scanner;

public class findElement {

    static int[] findFrequency(int[] a) {
        int[] arr = new int[100005];

        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Number of Queries :");
        int q = sc.nextInt();

        int[] freq = findFrequency(a);

        while (q > 0) {
            System.out.println("Enter element to search :");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
            q--;
        }

        sc.close();

    }
}
