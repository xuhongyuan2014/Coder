package test81;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] num={ 1, 2, 2, 3, 3 };
		int[] result=removeDup1(num);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	public static int[] removeDup(int [] num){//利用额外空间
		//String str=Arrays.toString(num);
		StringBuilder result=new StringBuilder();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++){
			if(!map.containsKey(num[i])){
				result.append(num[i]);
				map.put(num[i], i);
			}
		}
		int [] ret=new int[result.length()];
		for(int i=0;i<result.length();i++){
			ret[i]=result.charAt(i)-'0';
		}
		return ret;
	}
	public static int[] removeDup1(int [] num){//不利用外部空间,适用于有序数组
		int left=0;
		int right=1;
		while(right<num.length){
			if(num[left]==num[right]){
				right++;
			}
			else{
				num[left+1]=num[right];
				left++;
				right++;
			}
		}
		int [] result=Arrays.copyOf(num, left+1);
		return result;
	}
}
