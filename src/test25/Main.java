package test25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int lines=scan.nextInt();
		scan.nextLine();
		String[] array=new String[lines];
		for(int i=0;i<lines;i++){
			array[i]=scan.nextLine();
		}
		for(int i=0;i<lines;i++){
			printArrayByNum(array[i],8);
		}

	}
	public static void printArrayByNum(String str,int num){
		int length=(str.length()+(num-1))/num*num;
		int arraylength=1;
		int flag=0;
		StringBuilder result=new StringBuilder();
		while(flag<length){
			if(arraylength>num){
				System.out.println(result);
				result.delete(0, result.length());//Çå¿Õresult
				result.append(str.charAt(flag));
				arraylength=1;
			}else
			if(flag<str.length()){
				result.append(str.charAt(flag));
			}
			else {
				result.append('0');
			}
			arraylength=arraylength+1;
			flag=flag+1;
		}
		System.out.println(result);
	}
}
