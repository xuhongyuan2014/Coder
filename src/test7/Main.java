package test7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println(Main.JumpFloorX(n));
	}

	    public static int JumpFloor(int target) {//常规
	        if(target>2)return (JumpFloor(target-1)+JumpFloor(target-2));
	        if(target==1)return 1;
	        if(target==2)return 2;
	        return 0;
	    }
	    public static int JumpFloorX(int target) {//非常规
	    	int i=target-1;//i指向target的下一个
	    	int result=1;//初始值为1，一步到位
	    	if(target==1)return 1;
	    	while(i>=1){//找到所有方法
	      result=result+JumpFloorX(i);
	           i--;
	    	}
	    	return result;
	    }
}
