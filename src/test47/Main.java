package test47;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
    System.out.print(operate(scan.nextLine(),scan.nextLine()));
	
}
public static int operate(String str,String s){
	char c=s.charAt(0);
	int result=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==c){
		   result=result+1;
		}	
	}
	return result;
}
}
