package test60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [] str=scan.nextLine().split(";");
		int m=str.length;
		int n=str[0].trim().split(" ").length;
		//System.out.println(m);
		//System.out.println(str[0]);
		int [][] num=new int[m][n];
		for(int i=0;i<m;i++){
			String [] temp=str[i].trim().split(" ");
			for(int j=0;j<n;j++){
				num[i][j]=Integer.valueOf(temp[j]);
			}
		}
		int max=0;
		for(int i=0;i<m-1;i++){
			for(int j=0;j<n-1;j++){
				int temp=num[i][j]+num[i+1][j]+num[i][j+1]+num[i+1][j+1];
				if(max<temp) max=temp;
			}			
		}
		System.out.println(max);
	}

}
