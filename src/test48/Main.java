package test48;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	scan.nextLine();
	String[] str=new String[num];
	for(int i=0;i<num;i++){
		str[i]=scan.nextLine();
	}
	for(int i=0;i<num;i++){
	    operate(str[i]);
	}

	
}
public static void operate(String str){
	str=str.replace(" ", "");
	StringBuilder s=new StringBuilder(str);
	int num=8-str.length()%8;
	for(int i=0;i<num;i++){
		s.append('0');		
	}
	for(int i=0;i<s.length();i=i+8 ){
		System.out.println(s.substring(i, i+8));
	}
}
}
