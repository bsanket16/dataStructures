package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class union_intersect {

    final static Scanner scan = new Scanner(System.in);

    static void unionIntersection (int[] arr1, int[] arr2, int n, int m) {
        int i=0;
        int j=0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted Arrays: \n" + Arrays.toString(arr1) + " \n" + Arrays.toString(arr2));

        System.out.print("Union: ");

        ArrayList<Integer> intersect = new ArrayList<>();

        while (i<n && j<m) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr2[j] + " ");
                intersect.add(arr2[j]);
                i++;
                j++;
            }
        }

        while (i<n) {
            System.out.print(arr1[i++] + " ");
        }

        while (j<m) {
            System.out.print(arr2[j++] + " ");
        }

        System.out.print("\nIntersection: " + intersect);
    }

//    get values
    public static void getValues(int[] arr, int len) {
        for (int i=0; i<len; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        getValues(arr1, n);

        int m = scan.nextInt();
        int[] arr2 = new int[m];
        getValues(arr2, m);

        unionIntersection(arr1, arr2, n, m);
    }
}