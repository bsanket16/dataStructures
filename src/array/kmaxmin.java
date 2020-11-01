package array;

import java.util.Arrays;
import java.util.Scanner;

public class kmaxmin {

//    sort
    static void maxminKthElem(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int max = arr[n - k];
        int min = arr[(k - 1)];

        System.out.println("max: " + max + "\nmin: " + min);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t != 0) {

            int n = scan.nextInt();

            int[] values = new int[n];

            for (int i = 0; i < n; i++) {
                values[i] = scan.nextInt();
            }

            int k = scan.nextInt();

            if (k >= 1 && k <= n) {
                maxminKthElem(values, n, k);
            } else {
                System.out.println("K should be >= 1 and <= n");
                return;
            }

            t--;
        }
        scan.close();
    }
}