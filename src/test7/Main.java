package test7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println(Main.JumpFloorX(n));
	}

	    public static int JumpFloor(int target) {//����
	        if(target>2)return (JumpFloor(target-1)+JumpFloor(target-2));
	        if(target==1)return 1;
	        if(target==2)return 2;
	        return 0;
	    }
	    public static int JumpFloorX(int target) {//�ǳ���
	    	int i=target-1;//iָ��target����һ��
	    	int result=1;//��ʼֵΪ1��һ����λ
	    	if(target==1)return 1;
	    	while(i>=1){//�ҵ����з���
	      result=result+JumpFloorX(i);
	           i--;
	    	}
	    	return result;
	    }
}
