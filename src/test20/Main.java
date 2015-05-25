package test20;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(toBinaryString(a));
		System.out.println(toBinaryString(b));

	}
	public static String toBinaryString(int a){		//转换二进制		
		StringBuilder result=new StringBuilder();
		int discuss=a;
		while(discuss!=0){
			int remainder=discuss%2;
			result.insert(0, remainder);
			discuss=discuss/2;
		}
		return result.toString();
	}

}
