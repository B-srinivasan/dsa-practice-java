//Day 7: Arrays – Merge Sort (Divide and Conquer)
public class MergeSort {
    // Function to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        // Merge temp arrays back into arr[left..right]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    // Main function to sort using merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge them
            merge(arr, left, mid, right);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4};

        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Merge Sort:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
