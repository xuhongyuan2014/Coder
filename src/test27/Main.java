package test27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(AddLongInteger(scan.nextLine(),scan.nextLine()));


	}
	public static String AddLongInteger(String addend, String augend)
	 {
		addend=addend.replaceAll(" ", "");
		augend=augend.replaceAll(" ", "");
		//System.out.println(addend);
	     /*在这里实现功能*/
		int flag=0;//进位
		StringBuilder result=new StringBuilder();//结果
		int num=addend.length()>augend.length()?addend.length():augend.length();//比较长的字符串长度
		for(int i=0;i<num+1;i++){//注意增加一位
			int addendTemp,augendTemp,now;
			if(i>addend.length()-1){addendTemp=0;}
			else {addendTemp=addend.charAt(addend.length()-1-i)-'0';}//注意是addend.length()-1-i个;并且要减去‘0’;
			if(i>augend.length()-1){augendTemp=0;}
			else {augendTemp=augend.charAt(augend.length()-1-i)-'0';}	
			now=(addendTemp+augendTemp+flag)%10;//注意加上flag;注意次序
			flag=(addendTemp+augendTemp+flag)/10;
			if(i==num&&now==0){}//注意:保证最高位不为零
			else
			result.insert(0, now);		
		}
		
	  return result.toString();     
	 }

}
