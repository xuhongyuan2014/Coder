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
	   int [] total=new int[62];//0-9  A-Z a-z   一共62个
	   int [] target=new int[62];
	   for(int i=0;i<totalStr.length();i++){//初始化字符统计情况得到原始字符串的各个元素个数
		   if(totalStr.charAt(i)>='0'&&totalStr.charAt(i)<='9'){
			   total[totalStr.charAt(i)-'0']++;
		   }
		   else if(totalStr.charAt(i)>='A'&&totalStr.charAt(i)<='Z'){//注意:Z和z之间有六个其他字符,9和A之间也有七个其他字符
			   total[totalStr.charAt(i)-'A'+10]++;
		   }
		   else if(totalStr.charAt(i)>='a'&&totalStr.charAt(i)<='z'){//注意加36
			   total[totalStr.charAt(i)-'a'+36]++;
		   }
	   }
	   for(int i=0;i<targetStr.length();i++){//初始化字符统计情况得到目标字符串的各个元素个数
		   if(targetStr.charAt(i)>='0'&&targetStr.charAt(i)<='9'){
			   target[targetStr.charAt(i)-'0']++;
		   }
		   else if(targetStr.charAt(i)>='A'&&targetStr.charAt(i)<='Z'){//注意加10
			   target[targetStr.charAt(i)-'A'+10]++;
		   }
		   else if(targetStr.charAt(i)>='a'&&targetStr.charAt(i)<='z'){//注意加36
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
