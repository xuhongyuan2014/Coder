package test22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(toRevertString(scan.nextInt()));

	}
	public static String toRevertString(int num){	//½øÖÆ»»»»	
		StringBuilder result=new StringBuilder();
		if(num==0)return "0";
		while(num!=0){
			result.append(num%10);
			num=num/10;		
		}
		return result.toString();
	}

}
