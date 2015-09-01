package test50;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	System.out.println(zipString(str));

	
}
public static String zipString(String iniString) {
    // write code here
	StringBuilder result=new StringBuilder();
	char temp=' ';
	int num=0;
	for(int i=0;i<iniString.length();i++){
		//System.out.println(iniString.charAt(i));
		if(temp==iniString.charAt(i)){
			num=num+1;
		}
		else{

			temp=iniString.charAt(i);
			if(num!=0){
			result.append(num);
			}
			result.append(temp);
			num=1;

		}
		
	}
	if(num!=0){//ÎðÍü
		result.append(num);
		}
	if(result.length()<iniString.length()){
		return result.toString();
	}
	else {
		return iniString;
	}
}
}
