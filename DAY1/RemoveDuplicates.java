import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nCount of unique elements: " + newLength);

        sc.close();
    }

    // Function to remove duplicates from sorted array
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0; // index of next unique element

        // Loop to copy unique elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // Store last element
        arr[j++] = arr[n - 1];

        return j; // new length (number of unique elements)
    }
}
