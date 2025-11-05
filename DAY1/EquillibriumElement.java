import java.util.Scanner;

public class EquillibriumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int equilibrium = findEquilibriumElement(arr, n);

        if (equilibrium != -1) {
            System.out.println("Equilibrium element: " + equilibrium);
        } else {
            System.out.println("No equilibrium element found.");
        }

        sc.close();
    }

    // Function to find equilibrium element
    public static int findEquilibriumElement(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return arr[i]; // return the element (not index)
            }

            leftSum += arr[i];
        }

        return -1; // no equilibrium element
    }
}


