package test44;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println(operate(scan.nextLine()));
	}
	
public static String operate(String str){
	int result=0;
	if(str.startsWith("0x")){
		str=str.substring(2, str.length());
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(str.length()-1-i);
			result=(int) (result+parse(temp)*Math.pow(16,i));
			//System.out.println(result);
		}
	}
	return String.valueOf(result);
}
public static int parse(char c){
	if(c>='0'&&c<='9'){
		return c-'0';
	}
	else {
		return c+10-'A';
	}
}
}
