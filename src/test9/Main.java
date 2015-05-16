package test9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
4 4
1 2 8 9
2 4 9 12
4 7 10 13
6 8 11 15

		 * */
		Scanner scan=new Scanner(System.in);
		int m,n;
		String[] number=scan.nextLine().split(" ");
		m=Integer.valueOf(number[0]);
		n=Integer.valueOf(number[1]);
		int [][] array=new int [m][n];
		for(int i=0;i<m;i++){
		String[] str=scan.nextLine().split(" ");
			for(int j=0;j<n;j++){
				array[i][j]=Integer.valueOf(str[j]);			
			}
		}
		int target=scan.nextInt();
		System.out.println(Find(array,target));

	}

	  public static boolean Find(int [][] array,int target) {
		  /* 思路
		  * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
		  * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
		  * 要查找数字比左下角数字小时，上移
		  */
		  int row=array.length;
		  int col=array[0].length;
		  int rowTemp=row-1;
		  int colTemp=0;
		  boolean flag=false;
		  while(rowTemp>=0&&colTemp<=col-1){	
			  if(array[rowTemp][colTemp]==target){flag=true;break;}
			  else
			  if(array[rowTemp][colTemp]>target){rowTemp=rowTemp-1;}
			  else
			  if(array[rowTemp][colTemp]<target){colTemp=colTemp+1;}
	  
		  }
		  
		  return flag;
	    }
}
