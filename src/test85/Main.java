package test85;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long startTime=System.currentTimeMillis();   //获取开始时间
	
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
		
		
		long endTime=System.currentTimeMillis(); //获取结束时间
		//System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		}
	public static int getNum(String str,HashMap<String,Integer> map,int n){
		if(map.containsKey(str)){
			return 1;
		}
		int result=0;
		for(int i=1;i<=n&&i<str.length();i++){//注意&&i<str.length()
			//System.out.println(str);
			if(map.containsKey(str.subSequence(0, i))){
				result=result+getNum(str.substring(i,str.length()),map,n);
			}
		}
		return result;
    }

}
