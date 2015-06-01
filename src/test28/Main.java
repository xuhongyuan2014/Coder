package test28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int positiveNum=0;
		int negativeNum=0;
		int total=0;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine()){
			String str=scan.nextLine();
			if(str.equals(""))break;
			int num=Integer.valueOf(str);
			if(num<0){
				negativeNum++;
			}
			else {
				positiveNum++;
				total=total+num;
			}
		}
		System.out.println(negativeNum);
		
		if(positiveNum==0){System.out.println((double)0);}
		else {
			double result=total/positiveNum;
			System.out.println(result);}


	}

}
