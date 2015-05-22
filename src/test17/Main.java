package test17;

import java.util.ArrayList;
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
		//String[] str = scan.nextLine().split(" ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(Math.abs(a-b)%2==1){System.out.println(0);}
		if(Math.abs(a-b)%2==0){System.out.println(1);}

	}

	
}
