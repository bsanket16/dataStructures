package array;

import java.util.Scanner;

public class kadane_algo {

    final static Scanner sc = new Scanner(System.in);

    static void maxSumContigousArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE, calcMax, start, end, s;
        calcMax = start = end = s = 0;

        for (int j=1; j<n; j++) {

            calcMax = calcMax + arr[j];

            if(max < calcMax) {
                max = calcMax;
                start = s;
                end = j;
            }

            if (calcMax < 0) {
                calcMax = 0;
                s = j + 1;
            }

        }

        System.out.println("MaxSum: " + max + "\nStarting: " + start + " \nEnding: " + end);
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] values = new int[n];

        for(int i=0; i<n; i++) {
            values[i] = sc.nextInt();
        }

        sc.close();

        maxSumContigousArray(values, n);
    }
}