package test74;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String  a=scan.nextLine();
		String  b=scan.nextLine();
		System.out.println(Arrays.toString(partMathNum(a)));
		System.out.println(valid(a,b));
		System.out.println(Arrays.toString(partMathNum("abcdabdab")));
		

	}
	public static boolean valid(String str,String target){
		boolean flag=false;
		for(int i=0;i<str.length()&&!flag;i++){
			StringBuilder temp=new StringBuilder();
			for(int j=0;j<target.length()&&!flag;j++){
				//System.out.println(i);
				if(str.charAt(i+j)==target.charAt(j)){//注意此处坐标
					temp.append(target.charAt(j));
					//System.out.println(temp);
					if(temp.length()==target.length()){
						flag=true;
					}
				}
				else {
					int [] result=partMathNum(temp.toString());
					if(result.length==0){
						i=i+1;
					}
					else{
					i=i+(result.length-result[result.length-1]);
					temp.delete(0, temp.length());
					}
					break;//j=target.length();//跳出循环 break
				}
			}
		}
		return flag;
	}
	public static int[] partMathNum(String str){//计算部分匹配值
		int [] n=new int[str.length()];
		StringBuilder temp=new StringBuilder();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<n.length;i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), 1);
				n[i]=0;
			}
			else {//检测前缀和后缀
				temp.append(str.charAt(i));
				boolean flag=true;
				for(int j=0;j<temp.length();j++){
					if(str.charAt(j)!=temp.charAt(j)){
						flag=false;
					}
				}
				if(flag){
					n[i]=n[i-1]+1;	
				}
				else {
					//map.clear();
					temp.delete(0, temp.length());
				}

			}
		}
		return n;
	}
}