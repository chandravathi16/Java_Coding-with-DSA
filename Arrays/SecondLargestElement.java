/*********** 2. Second largest element in an array ************/
// code
import java.util.*;
public class SecondLargestElement {
    // Brute force approach - sorting technique [merge sort - O(n logn)]
    public static int approach1(int[] arr) {
        if(arr.length == 0 || arr.length == 1) return -1;
        Arrays.sort(arr);  // use merge sort instead
        return arr[arr.length - 2];
    }
    // better approach - O(n)
    public static int approach2(int[] arr) {
        int n = arr.length;
        if(n == 0 || n == 1) return -1;
        int largest = Integer.MIN_VALUE, slargest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            largest = Math.max(largest,arr[i]);
        }
        for(int i=0; i<n; i++) {
            if(arr[i] != largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
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
