package array;

import java.util.Scanner;

public class min_max {
    static void maximum_minimum_number(int[] arr) {

        int maximum = 0;

        for (int i : arr) {
            if (i > maximum) {
                maximum = i;
            }
        }
        System.out.println(maximum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] values = new int[n];

        for (int i=1; i<=n; i++) {
            values[i] = scan.nextInt();
        }
        scan.close();
        maximum_minimum_number(values);
    }
}
