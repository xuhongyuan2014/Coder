package test51;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	numberToWords(12345);

	
}
public static void numberToWords(int num) {
    String str=String.valueOf(num);
    //System.out.println(str);
    StringBuilder strtmp=new StringBuilder();
    for(int i=1;i<=str.length();i++){
    	if(i%3==0){
    		strtmp.append(str.charAt(str.length()-i));
    		strtmp.append(" ");
    	//System.out.println(str.charAt(str.length()-i));
    	}
    	else {
    		strtmp.append(str.charAt(str.length()-i));
    		//System.out.println(str.charAt(str.length()-i));
    	}
    }
    String [] temp=strtmp.toString().split(" ");
    StringBuilder result=new StringBuilder();
    for(int i=0;i<temp.length;i++){
    	System.out.println(new StringBuilder(temp[i]).reverse());
    	
    }
}
public void toEnglish(String str){

}
}
