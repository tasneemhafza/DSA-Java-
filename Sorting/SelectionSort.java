package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 3, 1};
        for(int i=0; i<arr.length-1; i++) {
        int smallest = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[j]< arr[smallest]) {
                smallest = j;
            }
        }
        //swap
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
        }
// Creating obj of Sorting class here from bubble sort file
        Sorting obj = new Sorting();
        obj.printArray(arr); 
    }
}