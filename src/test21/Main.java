package test21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(trimString(scan.nextLine()));

	}
	public static String trimString(String str){			

		int [] num=new int [27];
		for(int i=0;i<27;i++){//初始化为0
			num[i]=0;		
		}
		for(int i=0;i<str.length();i++){
			num[str.charAt(i)-'a']++;	//相应的字母对应---数组下标	
		}
		int min=num[0];
		for(int i=0;i<27;i++){//找出最小值
			if(min==0&&num[i]!=0)min=num[i];
			else 
			if(num[i]!=0&&num[i]<min){
				min=num[i];				
			}			
		}
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<27;i++){//加入待删除队列
			if(num[i]==min){
				char temp=(char) (i+'a');//注意:下标对应相应的字母
				list.add(temp);
			}		
		}
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++){//拼接结果字符串
			if(!list.contains(str.charAt(i))){
				result.append(str.charAt(i));
			}	
		}
		return result.toString();
	}

}
