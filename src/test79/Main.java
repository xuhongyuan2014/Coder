package test79;

import java.util.*;
import java.util.Map.Entry;


public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(getMaxUnique("abcbbbbcccbdddadacb"));
	}
	public static String getMaxUnique(String str){
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int left=0;
		String maxString="";
		int maxLength=0;
		for(int i=0;i<str.length();i++){
			if(map.size()==2&&!map.containsKey(str.charAt(i))){
				if(i-left>maxLength){//注意
					maxLength=i-left;
					maxString=str.substring(left,i);//注意
				}
				int temp=str.length();
				for(Entry<Character,Integer> entry:map.entrySet()){
					if(temp>entry.getValue()){
						temp=entry.getValue();
					}
				}
				left=temp+1;//注意
				map.remove(str.charAt(temp));//注意
			}
			map.put(str.charAt(i), i);			
		}
		if(map.size()==2&&maxLength==0){//注意
			return str;
		}
		return maxString;
		
	}
}
