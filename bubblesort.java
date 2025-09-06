package stp;

public class bubblesort {

	 public static void main(String[] args) {
	        int[] arr = {-3, -20, -14, 6, -105, -8, -29, -33};

	        System.out.println("Original array:");
	        printArray(arr);

	        bubbleSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

	    // Bubble Sort method
	    static void bubbleSort(int[] arr) {
	        int n = arr.length;
	       int out,in;
	       for(out=n-1;out>1;out--) {
	    	   for(in=0;in<out;in++) {
	    		   System.out.print(arr[in]+">"+arr[in+1]+"\t");
	    		   if(arr[in]>arr[in+1]) {
	    			   int temp = arr[in];
	                    arr[in] = arr[in + 1];
	                    arr[in + 1] = temp;
	                   
	    			   
	    		   
	    }
	    		   printArray(arr);}System.out.println();}}

	    // Print array method
	    static void printArray(int[] arr) {
	        for (int value : arr)
	            System.out.print(value + " ");
	        System.out.println();
	    }
	}


