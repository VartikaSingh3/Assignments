import java.util.Scanner;
public class countMaxFreqency {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countElementsWithMaxFrequency(arr);
        System.out.println("Count of elements with maximum frequency: " + result);

        sc.close();
    }

    public static int countElementsWithMaxFrequency(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        // Step 1: Count frequency of each element manually
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
        }

        // Step 2: Find the maximum frequency
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        // Step 3: Count how many unique elements have that frequency
        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && freq[i] == maxFreq) {
                countMax++;
            }
        }

        return countMax;
    }
}


