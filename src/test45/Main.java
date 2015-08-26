package test45;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print(operate(scan.nextInt()));
	
}
public static int operate(int num){
	int result=0;
	for(int i=7;i<=num;i++){
		if(i%7==0){
			result=result+1;
		}else {
			String temp=String.valueOf(i);
            CharSequence c="7";
            if(temp.contains(c)){
            	result=result+1;
            }
			
		}
		
	}
	return result;
}
}
