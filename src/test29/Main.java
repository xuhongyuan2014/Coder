package test29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
    	long a=System.currentTimeMillis();
		System.out.println(supercaculate(str));
		System.out.println("ִ�к�ʱ : "+(System.currentTimeMillis()-a)/1000f+" �� ");
    	long b=System.currentTimeMillis();
		System.out.println(caculate(str));
		System.out.println("ִ�к�ʱ : "+(System.currentTimeMillis()-b)/1000f+" �� ");


	}
   public static int caculate(String str) {//���ҵ�A�����P�ĸ������ұ�T�ĸ������

    	int result=0;
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)=='A'){
    			int left=0;
    			int right=0;
    			for(int m=0;m<i;m++){
    				if(str.charAt(m)=='P'){
    					left++;
    				}
    			}
    			for(int n=i;n<str.length();n++){
    				if(str.charAt(n)=='T'){
    					right++;
    				}
    			}
    			result=(result+left*right)%1000000007;
    		}
    	}
    
    	return result;	
    	
    }
    public static int supercaculate(String str) {//������һ�α���
    	int pNum=0;
    	int paNum=0;
    	int patNum=0;
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)=='P'){
    			pNum++;
    		}
    		else if(str.charAt(i)=='A'){
    			paNum=paNum+pNum;
    			paNum=paNum%1000000007;
    		}
    		else if(str.charAt(i)=='T'){
    			patNum=patNum+paNum;
    			patNum=patNum%1000000007;
    		}
    	}
    	return patNum;	
    	
    }
}
