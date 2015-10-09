Leetcode ¨C Word Break (Java)
 

Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

1. Naive Approach

This problem can be solve by using a naive approach, which is trivial. A discussion can always start from that though.

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
             return wordBreakHelper(s, dict, 0);
    }
 
    public boolean wordBreakHelper(String s, Set<String> dict, int start){
        if(start == s.length()) 
            return true;
 
        for(String a: dict){
            int len = a.length();
            int end = start+len;
 
            //end index should be <= string length
            if(end > s.length()) 
                continue;
 
            if(s.substring(start, start+len).equals(a))
                if(wordBreakHelper(s, dict, start+len))
                    return true;
        }
 
        return false;
    }
}
Time is O(n^2) and exceeds the time limit.

2. Dynamic Programming

The key to solve this problem by using dynamic programming approach:

Define an array t[] such that t[i]==true => 0-(i-1) can be segmented using dictionary
Initial state t[0] == true
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
 
                if(t[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }
}
Time: O(string length * dict size)

One tricky part of this solution is the case:

INPUT: "programcreek", ["programcree","program","creek"]. 
We should get all possible matches, not stop at "programcree".

3. Regular Expression

The problem is equivalent to matching the regular expression (leet|code)*, which means that it can be solved by building a DFA in O(2^m) and executing it in O(n). (Thanks to hdante.) Leetcode online judge does not allow using the Pattern class though.

public static void main(String[] args) {
	HashSet<String> dict = new HashSet<String>();
	dict.add("go");
	dict.add("goal");
	dict.add("goals");
	dict.add("special");
 
	StringBuilder sb = new StringBuilder();
 
	for(String s: dict){
		sb.append(s + "|");
	}
 
	String pattern = sb.toString().substring(0, sb.length()-1);
	pattern = "("+pattern+")*";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher("goalspecial");
 
	if(m.matches()){
		System.out.println("match");
	}
}
4. The More Interesting Problem

The dynamic solution can tell us whether the string can be broken to words, but can not tell us what words the string is broken to. So how to get those words?