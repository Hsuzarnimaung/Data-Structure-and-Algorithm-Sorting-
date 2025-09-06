package stp;

public class selectionsort {

	 public static void main(String[] args) {
	        String[] arr = {"bubble", "merge", "insertion", "selection", "heap", "radix", "quick"};

	        System.out.println("Original array:");
	        printArray(arr);

	        selectionSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	 public static int compareNumericStrings(String s1, String s2) {
	        // Remove leading zeros
	        s1 = s1.replaceFirst("^0+(?!$)", "");
	        s2 = s2.replaceFirst("^0+(?!$)", "");

	        // Compare lengths first
	        if (s1.length() > s2.length()) return 1;
	        if (s1.length() < s2.length()) return -1;

	        // Same length → compare each character (digit) one by one
	        for (int i = 0; i < s1.length(); i++) {
	            char c1 = s1.charAt(i);
	            char c2 = s2.charAt(i);
	            if (c1 > c2) return 1;
	            if (c1 < c2) return -1;
	        }

	        return 0; // all digits are equal
	    }
	    // Selection Sort method
	    static void selectionSort(String[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            // Assume the minimum is the first element
	            int minIndex = i;
	            printArray(arr);
	            // Check for the smallest element in the remaining unsorted array
	            for (int j = i + 1; j < n; j++) {
	            	 System.out.print(arr[j]+"<"+arr[minIndex]+"\t");
	            	// System.out.print(arr[j].compareTo(arr[minIndex]));
	                if (compareNumericStrings(arr[j],arr[minIndex])<0) {
	                    minIndex = j; // update index of minimum element
	                }
	                printArray(arr);
	               
	            }

	            // Swap the found minimum with the first element
	            String temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	            //printArray(arr);
	        }
	    }

	    // Print array method
	    static void printArray(String[] arr) {
	        for (String value : arr)
	            System.out.print(value + " ");
	        System.out.println();
	    }
	}

