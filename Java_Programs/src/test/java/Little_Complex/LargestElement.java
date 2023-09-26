package Little_Complex;

public class LargestElement {

	public static void main(String[] args) {
		// Test case 1: Input array A[] = [1, 3, 6, 2]
		int[] arr1 = {1, 3, 6, 2};
		int result1 = findLargestIndex(arr1);
		System.out.println("Test case 1: Output is " + result1);

//		// Test case 2: Input array A[] = [1, 2, 3, 4]
//		int[] arr2 = {1, 2, 3, 4};
//		int result2 = findLargestIndex(arr2);
//		System.out.println("Test case 2: Output is " + result2);
	}

	public static int findLargestIndex(int[] A) {
		// Initialize variables to keep track of the largest and second-largest elements
		int largest = -1;  // Initialize with a value that cannot occur in the array
		int secondLargest = -1;  // Initialize with a value that cannot occur in the array
		int largestIndex = -1;

		// Iterate through the array to find the largest and second-largest elements
		for (int i = 0; i < A.length; i++) {
			if (A[i] > largest) {
				// If a new largest element is found, update both largest and second-largest
				secondLargest = largest;
				largest = A[i];
				largestIndex = i;
			} else if (A[i] > secondLargest) {
				// If a new second-largest element is found, update only second-largest
				secondLargest = A[i];
			}
		}

		// Check if the largest element is at least twice as much as the second-largest
		if (largest >= 2 * secondLargest) {
			return largestIndex; // Return the index of the largest element
		} else {
			return -1; // Return -1 if the condition is not met
		}
	}
}
