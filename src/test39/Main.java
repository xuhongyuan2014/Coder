package test39;

import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(calculate(num));
	}
	public static int calculate(int num){
		int flag=0;
		while(num!=1){
			if(num%2==0){
				num=num/2;
			}
			else if(num%2==1){
				num=(3*num+1)/2;
			}
			flag++;
		}
		return flag;
	}
}
