package test7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println(Main.JumpFloor(n));
	}

	    public static int JumpFloor(int target) {
	        if(target>2)return (JumpFloor(target-1)+JumpFloor(target-2));
	        if(target==1)return 1;
	        if(target==2)return 2;
	        return 0;
	    }
}
