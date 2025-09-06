package stp;

public class insertionsort {
	  public static void main(String[] args) {
	        int[] arr = {-13, -15, -6, -3, -91, 0, -7, -45};

	        System.out.println("Original array:");
	        printArray(arr);

	        insertionSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

	    // Insertion Sort method
	    static void insertionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 1; i < n; i++) {
	            int key = arr[i];  // Element to be inserted
	            int j = i - 1;

	            // Move elements of arr[0..i-1], that are greater than key,
	            // to one position ahead of their current position
	            while (j >= 0 && arr[j] > key) {
	            	System.out.print(key+"<"+arr[j]+"\t");	                arr[j + 1] = arr[j]; 
	                printArray(arr);// shift element to the right
	                j--;
	            }
	            System.out.print(key+"<"+arr[j+1]+"\t");	
	            arr[j + 1] = key;  // Insert key at correct position
	            printArray(arr);
	            System.out.println();
	        }
	    }

	    // Print array method
	    static void printArray(int[] arr) {
	        for (int value : arr)
	            System.out.print(value + " ");
	        System.out.println();
	    }
}
