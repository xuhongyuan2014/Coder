package test72;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(zipString(scan.nextLine()));
	}

	 public static String zipString(String iniString) {
	        // write code here
		 StringBuilder str=new StringBuilder();
		 int flag=1;//注意初始值
		 for(int i=0;i<iniString.length();i++){
			 if(i==0){
				 str.append(iniString.charAt(i));
			 }
			 else if(str.charAt(str.length()-1)==iniString.charAt(i)){
				 flag++;
			 }
			 else {
				 str.append(flag);
				 str.append(iniString.charAt(i));
				 flag=1;//注意初始值
			 }
		 }
		 str.append(flag);//注意最后的flag
		 return iniString.length()>str.length()?str.toString():iniString;
	    }

}
