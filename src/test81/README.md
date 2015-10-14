LeetCode ¨C Remove Duplicates from Sorted Array (Java)
 

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. Do not allocate extra space for another array, you must do this in place with constant memory.

For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].

Thoughts

The problem is pretty straightforward. It returns the length of array with unique elements, but the original array need to be changed also. This problem should be reviewed with Remove Duplicates from Sorted Array II.

Solution 1

// Manipulate original array
public static int removeDuplicatesNaive(int[] A) {
	if (A.length < 2)
		return A.length;
 
	int j = 0;
	int i = 1;
 
	while (i < A.length) {
		if (A[i] == A[j]) {
			i++;
		} else {
			j++;
			A[j] = A[i];
			i++;
		}
	}
 
	return j + 1;
}
This method returns the number of unique elements, but does not change the original array correctly. For example, if the input array is {1, 2, 2, 3, 3}, the array will be changed to {1, 2, 3, 3, 3}. The correct result should be {1, 2, 3}. Because array's size can not be changed once created, there is no way we can return the original array with correct results.

Solution 2

// Create an array with all unique elements
public static int[] removeDuplicates(int[] A) {
	if (A.length < 2)
		return A;
 
	int j = 0;
	int i = 1;
 
	while (i < A.length) {
		if (A[i] == A[j]) {
			i++;
		} else {
			j++;
			A[j] = A[i];
			i++;
		}
	}
 
	int[] B = Arrays.copyOf(A, j + 1);
 
	return B;
}
 
public static void main(String[] args) {
	int[] arr = { 1, 2, 2, 3, 3 };
	arr = removeDuplicates(arr);
	System.out.println(arr.length);
}
In this method, a new array is created and returned.

Solution 3

If we only want to count the number of unique elements, the following method is good enough.

// Count the number of unique elements
public static int countUnique(int[] A) {
	int count = 0;
	for (int i = 0; i < A.length - 1; i++) {
		if (A[i] == A[i + 1]) {
			count++;
		}
	}
	return (A.length - count);
}
 
public static void main(String[] args) {
	int[] arr = { 1, 2, 2, 3, 3 };
	int size = countUnique(arr);
	System.out.println(size);
}