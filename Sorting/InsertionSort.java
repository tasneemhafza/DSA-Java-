package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 3, 1};
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j= i - 1;
            while (j>=0 && arr[j] > current) {
                //keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
    }
    Sorting obj = new Sorting();
    obj.printArray(arr);
}
}
