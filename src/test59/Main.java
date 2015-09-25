package test59;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [] str=scan.nextLine().split(" ");
		int [] n=new int[str.length];
		for(int i=0;i<str.length;i++){
			n[i]=Integer.valueOf(str[i]);
		}
		System.out.println(Find(n));
	}
	public static String Find(int [] n){
		int result=0;
		int flag=0;
		for(int i=0;i<n.length;i++){
			result=result+n[i];
		}
		//System.out.print(result);
		for(int i=n.length-1;i>=0;i--){
			if(result==0){
				flag=i;
				break;
				}
			result=result-n[i];

		}
		//System.out.print(flag);
		StringBuilder s=new StringBuilder();
		for(int i=0;i<=flag;i++){
			s.append(n[i]+" ");
		}
		return s.toString().trim();
	}
}
