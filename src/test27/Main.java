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
	     /*������ʵ�ֹ���*/
		int flag=0;//��λ
		StringBuilder result=new StringBuilder();//���
		int num=addend.length()>augend.length()?addend.length():augend.length();//�Ƚϳ����ַ�������
		for(int i=0;i<num+1;i++){//ע������һλ
			int addendTemp,augendTemp,now;
			if(i>addend.length()-1){addendTemp=0;}
			else {addendTemp=addend.charAt(addend.length()-1-i)-'0';}//ע����addend.length()-1-i��;����Ҫ��ȥ��0��;
			if(i>augend.length()-1){augendTemp=0;}
			else {augendTemp=augend.charAt(augend.length()-1-i)-'0';}	
			now=(addendTemp+augendTemp+flag)%10;//ע�����flag;ע�����
			flag=(addendTemp+augendTemp+flag)/10;
			if(i==num&&now==0){}//ע��:��֤���λ��Ϊ��
			else
			result.insert(0, now);		
		}
		
	  return result.toString();     
	 }

}
