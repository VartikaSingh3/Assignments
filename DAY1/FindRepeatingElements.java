import java.util.Scanner;

public class FindRepeatingElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        System.out.print("Repeating elements are: ");
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] == -1) continue; // skip already counted elements

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // mark as visited
                }
            }

            if (count > 1 && arr[i] != -1) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        sc.close();
    }
}
