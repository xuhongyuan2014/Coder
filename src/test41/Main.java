package test41;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
getCommonlyWord(scan.nextLine());
	}

	public static void getCommonlyWord(String str){
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++){
			String regEx = "[^A-Za-z0-9]";
			Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(words[i]);
            words[i]=m.replaceAll("").trim();
		}
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}
	}
}
