package array;

import java.util.Arrays;
import java.util.Scanner;

public class max_min {

//swap
    static void maxminArr(int[] arr, int n) {

        int max = arr[0];
        int min = arr[0];


        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }

//sort
    static void maxminArrSort(int[] arr, int n) {
    int max, min;

        if(n==1) {
            max = arr[0];
            min = arr[0];
        } else {
            Arrays.sort(arr);

            min = arr[0];
            max = arr[arr.length - 1];
        }

        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] values = new int[n];

        for (int i=0; i<n; i++) {
            values[i] = scan.nextInt();
        }

        scan.close();

        maxminArr(values, n);
        maxminArrSort(values, n);
    }
}
