package test73;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(dp(11));
		System.out.println(Arrays.toString(dp2(11)));
	}
	public static int dp(int m){//µÝ¹é
		int a=0;
		int b=0;
		int c=0;
		if(m-1>0){
			a=dp(m-1)+1;
		}else if(m-1==0){
			a=1;
		}
		else {a=999;}
		if(m-3>0){
			b=dp(m-3)+1;
		}else if(m-3==0){
			b=1;
		}
		else {b=999;}
		if(m-5>0){
			c=dp(m-5)+1;
		}else if(m-5==0){
			c=1;
		}
		else {c=999;}
		if(a<=b&&a<=c){
			return a;
		}
		else if(b<=a&&b<=c){
			return b;
		}
		else if(c<=a&&c<=b){
			return c;
			}
		else return 0;
	}
	public static int [] dp2(int m){//¶¯Ì¬¹æ»®
		int [] n=new int[m+1];
		for(int i=1;i<=m;i++){
		int a=0;
		int b=0;
		int c=0;
		if(i-1>0){
			a=n[i-1]+1;
		}else if(i-1==0){
			a=1;
		}
		else {a=999;}
		if(i-3>0){
			b=n[i-3]+1;
		}else if(i-3==0){
			b=1;
		}
		else {b=999;}
		if(i-5>0){
			c=n[i-5]+1;
		}else if(i-5==0){
			c=1;
		}
		else {c=999;}
		if(a<=b&&a<=c){
			n[i]=a;
		}
		else if(b<=a&&b<=c){
			n[i]=b;
		}
		else if(c<=a&&c<=b){
			n[i]=c;
			}
		
		}
		return n;
	}
}