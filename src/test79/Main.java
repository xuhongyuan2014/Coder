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
				if(i-left>maxLength){//ע��
					maxLength=i-left;
					maxString=str.substring(left,i);//ע��
				}
				int temp=str.length();
				for(Entry<Character,Integer> entry:map.entrySet()){
					if(temp>entry.getValue()){
						temp=entry.getValue();
					}
				}
				left=temp+1;//ע��
				map.remove(str.charAt(temp));//ע��
			}
			map.put(str.charAt(i), i);			
		}
		if(map.size()==2&&maxLength==0){//ע��
			return str;
		}
		return maxString;
		
	}
}
