package Sorting;

public class MergeSort {
    private static void merge(int[] array, int[] left, int[] right, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;

        // Compare and merge the elements of left and right subarrays
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i < leftSize) {
            array[k++] = left[i++];
        }

        // Copy remaining elements of right subarray, if any
        while (j < rightSize) {
            array[k++] = right[j++];
        }
    }

    // Function to perform merge sort
    public static void mergeSort(int[] array) {
        int length = array.length;

        // Base case: if array length is 1 or less, it is already sorted
        if (length < 2) {
            return;
        }

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // Divide the array into left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, length - mid);

        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays into the original array
        merge(array, left, right, mid, length - mid);
    }
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Original Array:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Utility function to print the array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
