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
     * 统计出第num次落地时，共经过多少米?
     * 
     * @param high 球的起始高度
     * @return 英文字母的个数
     */
    public static double getJourney(int high,int num)
    {
    	double result=0;
    	if(num==1)result=high;
    	else result=getJourney(high,num-1)+2*getTenthHigh(high,num);
        return result;
    }
    
    /**
     * 统计出第num次反弹多高?
     * 
     * @param high 球的起始高度
     * @return 空格的个数
     */
    public static double getTenthHigh(int high,int num)
    {
    	double result=0;
    	if(num==1)result=high;
    	else result=high/Math.pow(2, num-1);
        return result;
    }
}
