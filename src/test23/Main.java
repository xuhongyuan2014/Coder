package test23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);	
		int high=scan.nextInt();
		System.out.println(getJourney(high,5));
		System.out.println(getTenthHigh(high,6));

	}
	 /**
     * ͳ�Ƴ���num�����ʱ��������������?
     * 
     * @param high �����ʼ�߶�
     * @return Ӣ����ĸ�ĸ���
     */
    public static double getJourney(int high,int num)
    {
    	double result=0;
    	if(num==1)result=high;
    	else result=getJourney(high,num-1)+2*getTenthHigh(high,num);
        return result;
    }
    
    /**
     * ͳ�Ƴ���num�η������?
     * 
     * @param high �����ʼ�߶�
     * @return �ո�ĸ���
     */
    public static double getTenthHigh(int high,int num)
    {
    	double result=0;
    	if(num==1)result=high;
    	else result=high/Math.pow(2, num-1);
        return result;
    }
}
