LeetCode ¨C Remove Duplicates from Sorted Array II (Java)
 

Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?

For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5, and A is now [1,1,2,2,3].

Naive Approach

Given the method signature "public int removeDuplicates(int[] A)", it seems that we should write a method that returns a integer and that's it. After typing the following solution:

public class Solution {
    public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0)
            return 0;
 
        int pre = A[0];
        boolean flag = false;
        int count = 0;
 
        for(int i=1; i<A.length; i++){
            int curr = A[i];
 
            if(curr == pre){
                if(!flag){
                	flag = true;
                    continue;
                }else{
                    count++;
                }
            }else{
                pre = curr;
                flag = false;
            }
        }
 
        return A.length - count;
    }
}
Online Judge returns:

Submission Result: Wrong Answer
Input:	[1,1,1,2]
Output:	[1,1,1]
Expected:	[1,1,2]
So this problem also requires in-place array manipulation.

Correct Solution

We can not change the given array's size, so we only change the first k elements of the array which has duplicates removed.

public class Solution {
	public int removeDuplicates(int[] A) {
		if (A == null || A.length == 0)
			return 0;
 
		int pre = A[0];
		boolean flag = false;
		int count = 0;
 
		// index for updating
		int o = 1;
 
		for (int i = 1; i < A.length; i++) {
			int curr = A[i];
 
			if (curr == pre) {
				if (!flag) {
					flag = true;
					A[o++] = curr;
 
					continue;
				} else {
					count++;
				}
			} else {
				pre = curr;
				A[o++] = curr;
				flag = false;
			}
		}
 
		return A.length - count;
	}
}
Better Solution

public class Solution {
	public int removeDuplicates(int[] A) {
		if (A.length <= 2)
			return A.length;
 
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < A.length) {
			if (A[curr] == A[prev] && A[curr] == A[prev - 1]) {
				curr++;
			} else {
				prev++;
				A[prev] = A[curr];
				curr++;
			}
		}
 
		return prev + 1;
	}
}