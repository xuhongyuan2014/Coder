package test35;

import java.util.Scanner;
/*
 * 测试用例:
3 b

对应输出应该为:
bbb 
bbb
 * */
public class Main {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int cols=scan.nextInt();
		char c=scan.next().charAt(0);
		printOBM(cols,c);
	}
	public static void printOBM(int cols,char c){
		int lines=(cols+1)/2;//注意加一四舍五入
		for(int i=1;i<=lines;i++){
			for(int j=1;j<=cols;j++){
				if(i!=1&&i!=lines&&j!=1&&j!=cols){
					System.out.print(" ");
				}
				else if(j==cols&&i!=lines){
					System.out.println(c);
				}
				else {
					System.out.print(c);
				}
			}
		}
	}
}
