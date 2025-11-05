import java.util.Scanner;
public class MaxMinArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize min and max with the first element
        int max = arr[0];
        int min = arr[0];

        // Loop through the array to find max and min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        sc.close();
    }
}


