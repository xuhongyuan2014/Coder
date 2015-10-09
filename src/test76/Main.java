package test76;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int max=0;
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				if(valid(str.substring(i, j+1))&&max<(j+1-i)){
					max=j+1-i;
				}
			}
		}
		System.out.println(max);
		System.out.println(longestPalindrome(str));
	}

	public static boolean valid(String str) {//检测是否回文
		int i,j;
		for(i=0,j=str.length()-1;i<j;i++,j--){//头尾两个指针
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
		}
		return true;
	}
	 public static String longestPalindrome(String s) {//最长回文子串
			int max=0;
			int begin = 0,end = 0;
			for(int i=0;i<s.length();i++){//暴力遍历法
				for(int j=i;j<s.length();j++){
					if(valid(s.substring(i, j+1))&&max<(j+1-i)){
						max=j+1-i;
						begin=i;
						end=j;
					}
				}
			}
	        return s.substring(begin,end+1);
	    }
}