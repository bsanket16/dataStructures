package array;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByOne {

    static void rotateArray(int[] arr, int n) {
        int lastItem = arr[arr.length-1], i;

        for (i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastItem;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i=0; i<n; i++) {
            values[i] = sc.nextInt();
        }

        sc.close();
        rotateArray(values, n);
    }
}
