package test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public String strUp;
public String strDown;
public int [][] vector;
public int subLength=0;//������Ӵ��ĳ���
public HashMap<Integer,Integer> xyMap=new HashMap();//������Ӵ�������
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
public void buildVector(){//������̬�滮��ά����
	vector=new int[strDown.length()][strUp.length()];
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			if(strUp.charAt(j)==strDown.charAt(i)){
				if((i-1)>=0&&(j-1)>=0&&vector[i-1][j-1]>0)
				{		vector[i][j]=vector[i-1][j-1]+1;//���Ͻ���ֵ��������Ͻǵ�ֵ
				if(subLength<vector[i][j]){//�����Ӵ��������ֵ
					subLength=vector[i][j];
					}
				}
				else vector[i][j]=1;//���Ͻ�ûֵ��Ϊ1
			}
			else vector[i][j]=0;			
		}		
	}	
}

public void printVector(){	//��ӡ�����Ķ�ά����
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			System.out.print(vector[i][j]);
		}
		System.out.println("");
	}
}
public void printResult(){//��ӡ������Ӵ�
	System.out.println(subLength);
	for(int i=0;i<strDown.length();i++){
		for(int j=0;j<strUp.length();j++){
			if(vector[i][j]==subLength){//�����ҵ���Ӵ�������λ��(�ж�������)
				for(int n=0;n<subLength;n++){//�����������
					System.out.print(strUp.charAt(j-subLength+1+n));					
				}
				System.out.println("");
			}
		}
	}
	
}
}
