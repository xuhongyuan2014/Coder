package test30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String totalStr=scan.nextLine();
		String targetStr=scan.nextLine();
		caculate(totalStr,targetStr);


	}
   public static void caculate(String totalStr,String targetStr) {//
	   int [] total=new int[62];//0-9  A-Z a-z   һ��62��
	   int [] target=new int[62];
	   for(int i=0;i<totalStr.length();i++){//��ʼ���ַ�ͳ������õ�ԭʼ�ַ����ĸ���Ԫ�ظ���
		   if(totalStr.charAt(i)>='0'&&totalStr.charAt(i)<='9'){
			   total[totalStr.charAt(i)-'0']++;
		   }
		   else if(totalStr.charAt(i)>='A'&&totalStr.charAt(i)<='Z'){//ע��:Z��z֮�������������ַ�,9��A֮��Ҳ���߸������ַ�
			   total[totalStr.charAt(i)-'A'+10]++;
		   }
		   else if(totalStr.charAt(i)>='a'&&totalStr.charAt(i)<='z'){//ע���36
			   total[totalStr.charAt(i)-'a'+36]++;
		   }
	   }
	   for(int i=0;i<targetStr.length();i++){//��ʼ���ַ�ͳ������õ�Ŀ���ַ����ĸ���Ԫ�ظ���
		   if(targetStr.charAt(i)>='0'&&targetStr.charAt(i)<='9'){
			   target[targetStr.charAt(i)-'0']++;
		   }
		   else if(targetStr.charAt(i)>='A'&&targetStr.charAt(i)<='Z'){//ע���10
			   target[targetStr.charAt(i)-'A'+10]++;
		   }
		   else if(targetStr.charAt(i)>='a'&&targetStr.charAt(i)<='z'){//ע���36
			   target[targetStr.charAt(i)-'a'+36]++;
		   }	   	   
	   }
	   int left=0;
	   int notenough=0;
	   for(int i=0;i<62;i++){
		   //System.out.print(total[i]);
		   if(total[i]>target[i]){
			   left=left+(total[i]-target[i]);
		   }
		   else if(total[i]<target[i]){
			   notenough=notenough+(target[i]-total[i]);
		   }
	   }
/*	   System.out.println();
	   for(int i=0;i<62;i++){
		   System.out.print(target[i]);
	   }*/
    	if(notenough>0){
    		System.out.println("No "+notenough);
    	}
    	else {
    		System.out.println("Yes "+left);
    	}
    }
  
}
