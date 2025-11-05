import java.util.Scanner;

public class RevArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array from user
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed Array:");
        printArray(arr);

        sc.close();
    }

    // Function to reverse the array (without collections)
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
