package test83;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] num={-2,1,-3,4,-1,2,1,-5,4};
		int[] result=getMax(num);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	public static int[] getMax(int [] num){//先求SUM值,动态规划方法
		int [] sum=new int[num.length];
		//int m=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++){
			if(i==0){
				sum[i]=num[i];
			}
			else{
				sum[i]=sum[i-1]+num[i];	
			}
			System.out.println("*"+sum[i]);
		}		
		int left=0,right=0;
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				if(max<sum[j]-sum[i]){
					max=sum[j]-sum[i];
					left=i;
					right=j;
				}
			}
		}
		//System.out.println(max);
		//System.out.println(left);
		//System.out.println(right);
		return Arrays.copyOfRange(num, left+1, right+1);//注意此处+1
	}

}
