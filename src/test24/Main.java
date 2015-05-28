package test24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int num=scan.nextInt();
		System.out.println(getGC(str,num));

	}
	public static String getGC(String str,int num){
		int left=0;
		int right=num-1;
		int finalleft=left;
		int finalright=right;
		int times=getQuickTimes(str,left,right);
		double ratio=getQuickRatio(times, num);
		while(right+1<str.length()){
			if(str.charAt(right+1)=='G'||str.charAt(right+1)=='C'){//更新当前次数
				times=times+1;
			}
			if(str.charAt(left)=='G'||str.charAt(left)=='C'){//更新当前次数
				times=times-1;
			}
			right=right+1;//指针向右移动
			left=left+1;
			//System.out.println("left"+left);
			//System.out.println("right"+right);
			//System.out.println(times);
			//System.out.println(ratio);
			if(getQuickRatio(times, num)>ratio){//如果当前探测到的子串比例值大于存储的,则进行更新
				ratio=getQuickRatio(times, num);//更新最大比例
				//System.out.println(getQuickRatio(times, num));
				finalleft=left;//更新左指针
				finalright=right;//更新右指针
			}
		}
		return str.substring(finalleft, finalright+1);
	}
	public static double getRatio(String str,int left,int right){//获取比例
		double num=0;
		for(int i=left;i<=right;i++){
			if(str.charAt(i)=='G'||str.charAt(i)=='C'){
				num=num+1;
			}
		}
		return num/((double)right-(double)left+1);
	}
	public static int getQuickTimes(String str,int left,int right){//获取出现次数
		int num=0;
		for(int i=left;i<=right;i++){
			if(str.charAt(i)=='G'||str.charAt(i)=='C'){
				num=num+1;
			}
		}
		return num;
	}
	public static double getQuickRatio(double times,double num){//根据次数获取比例
		return times/num;
	}
}
