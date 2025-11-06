public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3}; // Example array

        InsertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to perform Insertion Sort
    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // Start from 1 since the first element is already "sorted"
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }
}


