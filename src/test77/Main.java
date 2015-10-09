package test77;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s="leetcode";
		Set<String> dict=new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		System.out.println(wordBreak(s,dict,0));
	}
	public static boolean wordBreak(String s,Set<String> dict,int start){
		if(start==s.length()){
			return true;
		}
		for(String str:dict){//µÝ¹éµ÷ÓÃ
			int len=str.length();
			if(start+len>s.length()){
				continue;
			}
			if(s.substring(start,start+len).equals(str)){
				if(wordBreak(s,dict,start+len)){
					return true;
				}
			}
		}
		return false;
	}

}