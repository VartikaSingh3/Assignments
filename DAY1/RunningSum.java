import java.util.Scanner;

public class RunningSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] runningSum = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Calculate running sum
        runningSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        // Print result
        System.out.println("Running Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(runningSum[i] + " ");
        }

        sc.close();
    }
}


