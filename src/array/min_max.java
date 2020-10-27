package array;

public class min_max {
    static void maximum_minimum_number(int[] arr) {

        int maximum = arr[0];
        int minimum = arr[0];

        for(int i=0; i<arr.length; i++) {
            for (int j=1; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    maximum = arr[i];
                    minimum = arr[j];
                } else if (arr[i] < arr[j]) {
                    maximum = arr[j];
                    minimum = arr[i];
                }
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }

    public static void main(String[] args) {
        int[] values = {2, 3, 4, 5};
        maximum_minimum_number(values);
    }
}
