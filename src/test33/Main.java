package test33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 7_This_is_a_test
_hs_s_a_es

7TI
*/
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String supposed=scan.nextLine();
		String sured=scan.nextLine();
		System.out.println(getWornOutKey(supposed,sured));
	}
	public static String getWornOutKey(String supposed,String sured) {
		int [] arrSupposed=new int[37];
		int [] arrSured=new int[37];
		StringBuilder result=new StringBuilder();
		for(int i=0;i<supposed.length();i++){
			if(supposed.charAt(i)>='0'&&supposed.charAt(i)<='9'){
				arrSupposed[supposed.charAt(i)-'0']++;
			}
			else if(supposed.charAt(i)>='a'&&supposed.charAt(i)<='z'){
				arrSupposed[supposed.charAt(i)-'a'+10]++;
			}
			else if(supposed.charAt(i)>='A'&&supposed.charAt(i)<='Z'){
				arrSupposed[supposed.charAt(i)-'A'+10]++;
			}
			else if(supposed.charAt(i)==' '){
				arrSupposed[36]++;
			}
		}
		for(int i=0;i<sured.length();i++){
			if(sured.charAt(i)>='0'&&sured.charAt(i)<='9'){
				arrSured[sured.charAt(i)-'0']++;
			}
			else if(sured.charAt(i)>='a'&&sured.charAt(i)<='z'){
				arrSured[sured.charAt(i)-'a'+10]++;
			}
			else if(sured.charAt(i)>='A'&&sured.charAt(i)<='Z'){
				arrSured[sured.charAt(i)-'A'+10]++;
			}
			else if(sured.charAt(i)==' '){
				arrSured[36]++;
			}
		}
		for(int i=0;i<37;i++){
			if(arrSupposed[i]>0&&arrSured[i]==0&&i<=9){
				char temp=(char) (i+'0');
				result.append(temp);
			}
			else	if(arrSupposed[i]>0&&arrSured[i]==0&&i<=35&&i>=10){
				char temp=(char) (i-10+'A');
				result.append(temp);
			}
			else	if(arrSupposed[i]>0&&arrSured[i]==0&&i==36){
				char temp=' ';
				result.append(temp);
			}
		}
		return result.toString();
	}
  
}
