package array;

import java.util.Scanner;

public class move_pos_neg {

    static void sortNegativePositive(int[] arr, int n) {
        int j=0;
        int temp;

        for (int i=0; i<n; i++) {
            if (arr[i]<0) {
                if (i!=j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for (int k=0; k<n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] values = new int[n];

        for (int i=0; i<n; i++) {
            values[i] = scan.nextInt();
        }

        sortNegativePositive(values, n);
        scan.close();
    }
}