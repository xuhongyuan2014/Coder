package test31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int [] numbers=new int[num];	
		scan.nextLine();
		String [] numbersStr=scan.nextLine().split(" ");
		for(int i=0;i<num;i++){
			numbers[i]=Integer.valueOf(numbersStr[i]);
		}
		int searchCount=scan.nextInt();
		int [] searchNum=new int[searchCount];
		for(int i=0;i<searchCount;i++){
			searchNum[i]=scan.nextInt();
		}
		caculate(numbers,searchNum);
	}
   public static void caculate(int[] numbers,int[] searchNum) {//
	   StringBuilder printStr=new StringBuilder();
	   int [] result=new int[101];
	   for(int i=0;i<numbers.length;i++){
		  // System.out.print(numbers[i]+" ");
		   result[numbers[i]]++;
	   }
	   		//System.out.println();
	   		
	   		
	   for(int i=0;i<searchNum.length;i++){
		   //System.out.print(searchNum[i]+" ");
		   printStr.append(result[searchNum[i]]+" ");
	   }
	   
/*	   for(int i=0;i<101;i++){
		   System.out.println(i+"--"+result[i]);
	   }*/
	   
	   System.out.print(printStr.toString().trim());
    }
  
}
