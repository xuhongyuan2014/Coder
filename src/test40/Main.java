package test40;

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
System.out.println(getEnglishNum(scan.nextInt()));
	}

/*	public void  parseStr(long num){
		if(num/1000000000>0){
			System.out.print(getEnglishNum((int)(num/1000000000))+" billion");
			num=num-num/1000000000*1000000000;			
		}
		if(num){
			
		}
	}*/
	public static String getEnglishNum(int num){//转换100以内读法
		if(num/10==0){
			return getGeWei(num);
		}else	
			if(num/10==1){
			switch(num){
			case 10: return "ten";
			case 11: return "eleven";
			case 12: return "twelve";
			case 13: return "thirteen";
			case 14: return "fourteen";
			case 15: return "fifteen";
			case 16: return "sixteen";
			case 17: return "seventeen";
			case 18: return "eighteen";
			case 19: return "nineteen";
			}
		}
		else 
		switch(num/10){
		case 2: return "twenty"+" "+getGeWei(num%10);
		case 3: return "thirty"+" "+getGeWei(num%10);
		case 4: return "forty"+" "+getGeWei(num%10);
		case 5: return "fifty"+" "+getGeWei(num%10);
		case 6: return "sixty"+" "+getGeWei(num%10);
		case 7: return "seventy"+" "+getGeWei(num%10);
		case 8: return "eighty"+" "+getGeWei(num%10);
		case 9: return "ninety"+" "+getGeWei(num%10);
		}
		return null;
	}

	public static String getGeWei(int num){
		switch(num){
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";	
		case 9: return "nine";		
		}
		return null;
	}
}
