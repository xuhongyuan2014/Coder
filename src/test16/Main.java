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
		System.out.println(a*b/getCommonfactor(a, b));//两个数的最大公因数×最小公倍数=两个数的积


	}

	public static int getCommonfactor(int a,int b) {//求最大公因数(公约数)---辗转相除法
		if(a<b){int temp=b;b=a;a=temp;}//保证a>b
		boolean flag=true;
		int result=0;
		while(flag){
			int r=a%b;
			//System.out.println(r);
			if(r==0){
				result=b;		//结果是b不是r		
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
	 * 两个数的最大公因数×最小公倍数=两个数的积
	 * 求最大公因数，用辗转相除法
	 * 
	 * 
	 * 
	 * 
	 * */

}
