package test5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public List data=new ArrayList();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main program=new Main();
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++){
			program.data.add(str.charAt(i));
		}
		program.ajustData(0, program.data.size()-1);
	}

	public void sortData(int l,int r){
		int flag=ajustData(l,r);
		sortData(l,flag-1);
		sortData(flag+1,r);
		
	}
	public int ajustData(int l,int r){
		char head=(char) data.get(0);
		int left=l;
		int right=r;
		while(left<right){
			while(l<r&&(char)data.get(right)>(char)head){
				right--;
				//System.out.println(data.toArray());
			}
			data.set(left,data.get(right));
			data.set(right, head);
			while(l<r&&(char)data.get(left)<(char)head){
				left++;
				//System.out.println(data.toArray());
			}
			data.set(right, left);
			data.set(left, head);
		}
		for(int i=0;i<data.size()-1;i++){
			System.out.println((char)data.get(i));
		}
return left;
		
	}
}
