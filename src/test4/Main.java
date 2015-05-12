package test4;

import java.util.Scanner;

public class Main {
	public String str;
	public String result="";
Main(String str){
	this.str=str;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Main program=new Main(scan.nextLine());
program.operateStr();
	}

	public void operateStr(){
		for(int i=0;i<str.length();i++){
			if(isNum(str.charAt(i))){//第i位是数字
				if(i==0)result=result+"*"+str.charAt(i);
				if(i==str.length()-1)result=result+str.charAt(i)+"*";
				if(result.length()>=1&&!isNum(result.charAt(result.length()-1)))result=result+"*"+str.charAt(i);
			}
			
		}
		System.out.println(result);	
		
	}
	public boolean isNum(char c){
		if(c>=48&&c<=57)
			return true;
		else return false;
		
	}
}
