package test31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String totalStr=scan.nextLine();
		String targetStr=scan.nextLine();


	}
   public static void caculate(int[] numbers,int[] searchNum) {//
	   StringBuilder printStr=new StringBuilder();
	   int [] result=new int[101];
	   for(int i=0;i<numbers.length;i++){
		   result[numbers[i]]++;
	   }
	   for(int i=0;i<searchNum.length;i++){
		   printStr.append(result[i]+" ");
	   }
	   System.out.println(printStr.toString().trim());
    }
  
}
