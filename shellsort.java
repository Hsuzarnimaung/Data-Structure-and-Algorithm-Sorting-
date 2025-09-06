package stp;

public class shellsort {
	 public static void main(String[] args) {
		 String[] arr = { "tiger", "elephant", "dolphin", "eagle", "parrot", "penguin", "frog" };

	        System.out.println("Original array:");
	        printArray(arr);

	        shellSort(arr);

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
	    // Shell Sort method
	    static void shellSort(String[] arr) {
	        int n = arr.length;

	        // Start with a big gap, then reduce the gap
	        for (int gap = n / 2; gap > 0; gap /= 2) {
	            // Do a gapped insertion sort for this gap size
	            for (int i = gap; i < n; i++) {
	                String temp = arr[i];
	                int j=i;
	                System.out.println(arr[j - gap]+">"+temp);
	                // Shift earlier gap-sorted elements up until the correct location is found
	                for (j = i; j >= gap && compareNumericStrings(arr[j - gap], temp)>0; j -= gap) {
	                	System.out.println(arr[j - gap]+">"+temp);
	                    arr[j] = arr[j - gap];
	                    printArray(arr);
	                }
	                
	                // Put temp (the original arr[i]) in its correct location
	                arr[j] = temp;
	                printArray(arr);
	            }
	           
	        }
	    }

	    // Print array method
	    static void printArray(String[] arr) {
	    	System.out.print("[");
	        for (String value : arr)
	            System.out.print(value + ", ");
	        System.out.print("]");
	        System.out.println();
	    }
}
