Longest Substring Which Contains 2 Unique Characters
 

This is a problem asked by Google.

Given a string, find the longest substring that contains only two unique characters. For example, given "abcbbbbcccbdddadacb", the longest substring that contains 2 unique character is "bcbbbbcccb".

1. Longest Substring Which Contains 2 Unique Characters

In this solution, a hashmap is used to track the right most index of 2 unique elements in the map. When a third character is being added to the map, the left pointer needs to move to the leftmost position in the map.

You can use "abac" to walk through this solution.

public static String maxSubString2UniqueChars(String s) {
	int maxLen = 0;
	String maxSubstring = null;
	int m = 0;
 
	// declare a map to track the right most position of the two characters
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		// if map contains 2 characters, process
		if (map.size() == 2 && !map.containsKey(c)) {
			if (i - m > maxLen) {
				maxLen = i - m;
				maxSubstring = s.substring(m, i);
			}
 
			// get the left most index for
			int leftMost = s.length();
			for (Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() < leftMost) {
					leftMost = entry.getValue();
				}
			}
 
			m = leftMost + 1;
			map.remove(s.charAt(leftMost));
		}
 
		map.put(c, i);
	}
 
	if (map.size() == 2 && maxLen == 0) {
		return s;
	}
 
	return maxSubstring;
}
Now if this question is extended to be "the longest substring that contains k unique characters", what should we do? Apparently, the solution above is not scalable.

2. Naive Solution for K Unique Characters

The above solution can be extended to be a more general solution which would allow k distinct characters.

public static String maxSubStringKUniqueChars(String s, int k) {
	int maxLen = 0;
	String maxSubstring = null;
	int m = 0;
 
	// declare a map to track the right most position of the two characters
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		// if map contains 2 characters, process
		if (map.size() == k && !map.containsKey(c)) {
			if (i - m > maxLen) {
				maxLen = i - m;
				maxSubstring = s.substring(m, i);
			}
 
			int leftMost = s.length();
			for (Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() < leftMost) {
					leftMost = entry.getValue();
				}
			}
 
			m = leftMost + 1;
			map.remove(s.charAt(leftMost));
		}
 
		map.put(c, i);
	}
 
	if (map.size() == k && maxLen == 0) {
		return s;
	}
 
	return maxSubstring;
}
The time is O(n*k). Can you get a better solution?

3. Better Solution for K Unique Characters

public static String maxSubStringKUniqueChars(String s, int k) {
	//declare a counter
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();		
	int start = 0;
	int maxLen = 0;
	String maxSubstring = null;
 
	for (int i = 0; i < s.length(); i++) {
		//add each char to the counter
		char c = s.charAt(i);
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
		}else{
			map.put(c, 1);
		}
 
		if(map.size() == k+1){
			//get maximum
			int range = i-start;
			if(range > maxLen){
				maxLen = range;
				maxSubstring = s.substring(start, i);
			}
 
			//move left cursor toward right, so that substring contains only k chars
			while(map.size()>k){
				char first = s.charAt(start);
				int count = map.get(first);
				if(count>1){
					map.put(first,count-1);
				}else{
					map.remove(first);
				}
				start++;
			}
		}
	}
 
	if (map.size() == k && maxLen == 0) {
		return s;
	}
 
	return maxSubstring;
}
Time is O(n).