import java.util.Scanner;

public class RotateArray {

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.print("Rotate Left or Right? (L/R): ");
        char dir = sc.next().charAt(0);

        // Normalize k in case k > n
        k = k % n;

        if (dir == 'R' || dir == 'r') {
            rotateRight(arr, k);
            System.out.println("Array after Right Rotation:");
        } else {
            rotateLeft(arr, k);
            System.out.println("Array after Left Rotation:");
        }

        printArray(arr);
        sc.close();
    }

    // Function to rotate array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    // Function to rotate array to the left by k positions
    public static void rotateLeft(int[] arr, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    // Helper function to reverse a section of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print array function
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


