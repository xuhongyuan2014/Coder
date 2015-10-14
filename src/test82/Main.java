package test82;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] num={ 1, 2,2, 2, 3, 3 };
		int[] result=removeDup(num);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	public static int[] removeDup(int [] num){//利用额外空间
		//String str=Arrays.toString(num);
		int N=2;
		StringBuilder result=new StringBuilder();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++){
			if(!map.containsKey(num[i])){
				result.append(num[i]);
				map.put(num[i], 1);
			}
			else{
				int val=map.get(num[i])+1;
				map.put(num[i], val);
				if(map.get(num[i])<=N){
					result.append(num[i]);
				}
			}
		}
		int [] ret=new int[result.length()];
		for(int i=0;i<result.length();i++){
			ret[i]=result.charAt(i)-'0';
		}
		return ret;
	}

}
