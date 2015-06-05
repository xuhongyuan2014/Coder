package test36;

import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		print(scan.nextInt());
	}
	public static void print(int num){
		int b=num/100;
		int s=(num-b*100)/10;
		int g=(num-b*100-s*10);
		for(int i=1;i<=b;i++){
			System.out.print("B");
		}
		for(int i=1;i<=s;i++){
			System.out.print("S");
		}
		for(int i=1;i<=g;i++){
			System.out.print(i);
		}
	}
}
