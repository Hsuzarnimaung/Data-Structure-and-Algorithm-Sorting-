package stp;

public class QuickSort {
    // A utility function to swap two elements
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // A utility function to print the array
    static void printArray(int arr[], int n) {
    	System.out.print( "{ ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.print( " }");
        System.out.println();
    }
    static void printpartitionArray(int arr[], int l,int j) {
    	System.out.print( "{ ");
        for (int i=l; i < j; i++)
            System.out.print(arr[i] + " ");
        System.out.print( " }");
        System.out.println();
    }
    // The main function to that sorts arr[] of size n using Quick Sort
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            System.out.println("Partition index: " + arr[pi]);
            
            
            printpartitionArray(arr,low,pi-1);
            printpartitionArray(arr,pi+1,arr.length);
            printArray(arr, arr.length);
            quickSort(arr, low, pi - 1);
            
            quickSort(arr, pi + 1, arr.length-1);
            
        }
    }

    // A utility function to partition the array
    static int partition(int arr[], int low, int high) {
        int pivot = arr[arr.length-1]; // pivot
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {-13, -15, -6, -3, -91, 0, -7, -45};
        int n = arr.length;
        System.out.println("Original array:");
        printArray(arr, n);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}
