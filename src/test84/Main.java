package test84;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
		String [] result=new String[num];
		for(int i=0;i<num;i++){
			result[i]=delete(scan.nextLine());
		}
		for(int i=0;i<num;i++){
			System.out.println(result[i]);
		}
		}
	public static String delete(String str){
    	StringBuilder s = new StringBuilder();
    	int[] has = new int[128];
    	for(int i = 0; i < str.length(); i++){
    		char c = str.charAt(i);
    		if(has[c] == 0){
    			s.append(c);
    			has[c] = 1;
    		}
    	}
    	
    	return s.toString();
    }

}
