package test16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//String[] str = scan.nextLine().split(" ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a*b/getCommonfactor(a, b));//�������������������С������=�������Ļ�


	}

	public static int getCommonfactor(int a,int b) {//���������(��Լ��)---շת�����
		if(a<b){int temp=b;b=a;a=temp;}//��֤a>b
		boolean flag=true;
		int result=0;
		while(flag){
			int r=a%b;
			//System.out.println(r);
			if(r==0){
				result=b;		//�����b����r		
				flag=false;		
			}
			else {
				a=b;
				b=r;			
			}
			
		}
		return result;
		
	}
	
	/*
	 * �������������������С������=�������Ļ�
	 * �������������շת�����
	 * 
	 * 
	 * 
	 * 
	 * */

}
