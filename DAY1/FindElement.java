import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index: " + i);
                found = true;
                // you can break here if you only want the first occurrence
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close();
    }
}
