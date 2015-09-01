package test49;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	System.out.println(replaceSpace(str,str.length()));

	
}
public static String replaceSpace(String iniString, int length) {
    // write code here
	StringBuilder result=new StringBuilder();
	for(int i=0;i<iniString.length();i++){
		if(iniString.charAt(i)==' '){
			result.append("%20");
		}
		else {
			result.append(iniString.charAt(i));			
		}		
	}
	return result.toString();
}
}
