package test43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	/**
	 * @param args[�Զ���Ƚϴ�С����]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		sortString(scan.nextLine());
	}

	public static void sortString(String str) {//����������
		char[] result=str.toCharArray();
		for(int i=0;i<result.length;i++){
			if(!Character.isLetter(result[i])) {
				continue;
				}
			else {
			for(int j=i;j<result.length;j++){
				if(!Character.isLetter(result[j])) {
					continue;
					}
				else {
					//System.out.println(result[i]+""+result[j]);
					if(isBigger(result[i],result[j])){
						char temp=result[j];
						result[j]=result[i];
						result[i]=temp;
						//System.out.println("true");
					}
				}
			}
			}
		}
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
			//System.out.print(Character.isLetter(result[i]));
		}
	}
	public static boolean isBigger(char a,char b){//�Զ���Ƚϴ�С����,������ĸ�ⶼ����������,��ĸ��Сд��һ��
		a=Character.toLowerCase(a);
		b=Character.toLowerCase(b);
		if(!Character.isLetter(a)||!Character.isLetter(b)){
			return false;
		}
		else if(a>b){
			return true;
		}
		else {
			return false;
		}
	}

}
