package test8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println(Main.RectCover(n));
	}

	 public static int RectCover(int target) {

		if(target>2) return RectCover(target-1)+RectCover(target-2);
		if(target==2) return 2;
		if(target==1) return 1;
		return 0;
	    }
}
