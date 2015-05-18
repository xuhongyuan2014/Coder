package test12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(revert(str));
	}

	public static String revert(String str) {//
		StringBuffer result=new StringBuffer();
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			if(Character.isUpperCase(temp)){
				if(temp=='Z') temp='a';
				else temp=(char) (Character.toLowerCase(temp)+1);
			}
			else if(temp>='a'&&temp<='c') temp='2';
			else if(temp>='d'&&temp<='f') temp='3';
			else if(temp>='g'&&temp<='i') temp='4';
			else if(temp>='j'&&temp<='l') temp='5';
			else if(temp>='m'&&temp<='o') temp='6';
			else if(temp>='p'&&temp<='s') temp='7';
			else if(temp>='t'&&temp<='v') temp='8';
			else if(temp>='w'&&temp<='z') temp='9';
			
			result.append(temp);
		}
		return result.toString();
	}
}
