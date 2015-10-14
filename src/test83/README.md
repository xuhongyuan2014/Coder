LeetCode – Maximum Subarray (Java)
 

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray [4,−1,2,1] has the largest sum = 6.

1. Wrong Solution

This is a wrong solution, check out the discussion below to see why it is wrong. I put it here just for fun.

public class Solution {
	public int maxSubArray(int[] A) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
 
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			maxSum = Math.max(maxSum, sum);
 
			if (sum < 0)
				sum = 0;
		}
 
		return maxSum;
	}
}
2. Dynamic Programming Solution

The changing condition for dynamic programming is "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum."

public class Solution {
	public int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}
}
3. Simple Solution

Mehdi provided the following solution in his comment.

  public int maxSubArray(int[] A) {
       int newsum=A[0];
       int max=A[0];
       for(int i=1;i<A.length;i++){
           newsum=Math.max(newsum+A[i],A[i]);
           max= Math.max(max, newsum);
       }
       return max;
    }
This problem is asked by Palantir.