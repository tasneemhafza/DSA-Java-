package Sorting;

class Sorting{
    public void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {53,45,87,52,77};
    // Bubble Sort
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]> arr[j+1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Sorting obj = new Sorting();
        obj.printArray(arr);
    }
}