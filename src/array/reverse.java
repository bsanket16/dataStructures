package array;

import java.util.Scanner;

public class reverse {

//  swap
    static void reverseArraySwap(int[] arr, int n) {
        int i;
        int j = n- 1;

        for (i=0; i<j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        for (int value : arr) {
            System.out.println(value);
        }

    }

//  new array
    static void reverseArrayNew(int[] arr, int n) {
        int j = n-1;
        int[] newArray = new int[n];

        for(int i=0; i<n; i++) {
            newArray[j] = arr[i];
            j--;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] values = new int[n];

        for(int i=0; i<n; i++) {
            values[i] = scan.nextInt();
        }
        scan.close();

//      comment one before running;

        reverseArraySwap(values, n);
        reverseArrayNew(values,n);
    }
}
