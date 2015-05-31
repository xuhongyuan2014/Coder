package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(CalcCapital(scan.nextLine()));


	}
	public static int CalcCapital(String str){
		int result=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
				result=result+1;
			}
		}
		return result;
	}
}
