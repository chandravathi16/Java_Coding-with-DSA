
/****** 1. Largest element in an array ******/

// code
import java.util.*;
public class LargestElement {
        // Brute force approach - sorting technique [merge sort/bubble sort - O(n logn)/O(n^2)]
        public static int approach1(int[] arr) {
            Arrays.sort(arr);  // use merge sort instead 
            return arr[arr.length-1];
        }
	// optimal approach - O(n) 
	public static int approach2(int[] arr) {
	    int largest = Integer.MIN_VALUE;
	    for(int i=0; i<arr.length; i++) {
	        if(arr[i] > largest) {
	            largest = arr[i];
	        }
	        //largest = Math.max(largest,arr[i]);
	    }
	    return largest;
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	       arr[i] = sc.nextInt();
	    }
            System.out.println(approach1(arr)); 
            System.out.println(approach2(arr));
	}
}