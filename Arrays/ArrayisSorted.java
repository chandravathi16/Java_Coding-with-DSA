/*********** 3.Check if array is sorted or not (ascending/Increasing/Non-decreasing) *************/
// code 
import java.util.*;
public class ArrayisSorted {
    // Brute force approach - O(n^2)
    public static boolean approach1(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    // optimal approach - O(n)
    public static boolean approach2(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
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
