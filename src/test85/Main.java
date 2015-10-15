package test85;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long startTime=System.currentTimeMillis();   //��ȡ��ʼʱ��
	
		int num=scan.nextInt();
		scan.nextLine();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int n=Integer.MIN_VALUE;
		for(int i=0;i<num;i++){
			String str=scan.nextLine();
			map.put(str, i);
			if(n<str.length()){
				n=str.length();
			}
		}
		System.out.println(getNum(scan.nextLine(),map,n));
		
		
		long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		//System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ms");
		}
	public static int getNum(String str,HashMap<String,Integer> map,int n){
		if(map.containsKey(str)){
			return 1;
		}
		int result=0;
		for(int i=1;i<=n&&i<str.length();i++){//ע��&&i<str.length()
			//System.out.println(str);
			if(map.containsKey(str.subSequence(0, i))){
				result=result+getNum(str.substring(i,str.length()),map,n);
			}
		}
		return result;
    }

}
