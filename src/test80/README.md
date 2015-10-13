LeetCode ¨C Longest Substring Without Repeating Characters (Java)
 

Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

Java Solution 1

The first solution is like the problem of "determine if a string has all unique characters" in CC 150. We can use a flag array to track the existing characters for the longest substring without repeating characters.

public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
	boolean[] flag = new boolean[256];
 
	int result = 0;
	int start = 0;
	char[] arr = s.toCharArray();
 
	for (int i = 0; i < arr.length; i++) {
		char current = arr[i];
		if (flag[current]) {
			result = Math.max(result, i - start);
			// the loop update the new start point
			// and reset flag array
			// for example, abccab, when it comes to 2nd c,
			// it update start from 0 to 3, reset flag for a,b
			for (int k = start; k < i; k++) {
				if (arr[k] == current) {
					start = k + 1; 
					break;
				}
				flag[arr[k]] = false;
			}
		} else {
			flag[current] = true;
		}
	}
 
	result = Math.max(arr.length - start, result);
 
	return result;
}
Java Solution 2

This solution is from Tia. It is easier to understand than the first solution.

The basic idea is using a hash table to track existing characters and their position. When a repeated character occurs, check from the previously repeated character. However, the time complexity is higher - O(n^3).

public static int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
	char[] arr = s.toCharArray();
	int pre = 0;
 
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < arr.length; i++) {
		if (!map.containsKey(arr[i])) {
			map.put(arr[i], i);
		} else {
			pre = Math.max(pre, map.size());
			i = map.get(arr[i]);
			map.clear();
		}
	}
 
	return Math.max(pre, map.size());
}
Consider the following simple example.

abcda
When loop hits the second "a", the HashMap contains the following:

a 0
b 1
c 2
d 3
The index i is set to 0 and incremented by 1, so the loop start from second element again.