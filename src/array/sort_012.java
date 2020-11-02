package array;

import java.util.Arrays;
import java.util.Scanner;

public class sort_012 {

//    dutch flag technique
    static void sort_zeOnTw (int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t!=0) {

            int n = scan.nextInt();

            int[] values = new int[n];

            for (int i=0; i<n; i++) {
                values[i] = scan.nextInt();
            }

            t--;
            sort_zeOnTw(values, n);
        }

        scan.close();
    }
}