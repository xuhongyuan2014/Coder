package test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public String strUp;
public String strDown;
public int [][] vector;
public int subLength=0;//最长公共子串的长度
public HashMap<Integer,Integer> xyMap=new HashMap();//最长公共子串的坐标
	public String getStrUp() {
	return strUp;
}
public void setStrUp(String strUp) {
	this.strUp = strUp;
}
public String getStrDown() {
	return strDown;
}
public void setStrDown(String strDown) {
	this.strDown = strDown;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      Main program=new Main();
      program.setStrUp(scan.nextLine());
      program.setStrDown(scan.nextLine());
      program.buildVector();
      program.printVector();
      program.printResult();

	}
public void buildVector(){//构建动态规划二维矩阵
	vector=new int[strDown.length()][strUp.length()];
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			if(strUp.charAt(j)==strDown.charAt(i)){
				if((i-1)>=0&&(j-1)>=0&&vector[i-1][j-1]>0)
				{		vector[i][j]=vector[i-1][j-1]+1;//左上角有值则加上左上角的值
				if(subLength<vector[i][j]){//更新子串长度最大值
					subLength=vector[i][j];
					}
				}
				else vector[i][j]=1;//左上角没值则为1
			}
			else vector[i][j]=0;			
		}		
	}	
}

public void printVector(){	//打印构建的二维矩阵
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			System.out.print(vector[i][j]);
		}
		System.out.println("");
	}
}
public void printResult(){//打印最长公共子串
	System.out.println(subLength);
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			if(vector[i][j]==subLength){//遍历找到最长子串的坐标位置(有多个的情况)
				for(int n=0;n<subLength;n++){//从左向右输出
					System.out.print(strUp.charAt(j-subLength+1+n));					
				}
				System.out.println("");
			}
		}
	}
	
}
}
