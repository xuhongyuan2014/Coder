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
			if(str.charAt(right+1)=='G'||str.charAt(right+1)=='C'){//���µ�ǰ����
				times=times+1;
			}
			if(str.charAt(left)=='G'||str.charAt(left)=='C'){//���µ�ǰ����
				times=times-1;
			}
			right=right+1;//ָ�������ƶ�
			left=left+1;
			//System.out.println("left"+left);
			//System.out.println("right"+right);
			//System.out.println(times);
			//System.out.println(ratio);
			if(getQuickRatio(times, num)>ratio){//�����ǰ̽�⵽���Ӵ�����ֵ���ڴ洢��,����и���
				ratio=getQuickRatio(times, num);//����������
				//System.out.println(getQuickRatio(times, num));
				finalleft=left;//������ָ��
				finalright=right;//������ָ��
			}
		}
		return str.substring(finalleft, finalright+1);
	}
	public static double getRatio(String str,int left,int right){//��ȡ����
		double num=0;
		for(int i=left;i<=right;i++){
			if(str.charAt(i)=='G'||str.charAt(i)=='C'){
				num=num+1;
			}
		}
		return num/((double)right-(double)left+1);
	}
	public static int getQuickTimes(String str,int left,int right){//��ȡ���ִ���
		int num=0;
		for(int i=left;i<=right;i++){
			if(str.charAt(i)=='G'||str.charAt(i)=='C'){
				num=num+1;
			}
		}
		return num;
	}
	public static double getQuickRatio(double times,double num){//���ݴ�����ȡ����
		return times/num;
	}
}
