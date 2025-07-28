//Day 8: Quick Sort
public class QuickSort {
    
    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // Recursively sort left and right of pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
