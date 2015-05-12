package test3;

import java.util.Scanner;

public class Main1 {
public String strUp;
public String strDown;
	public String getStrUp() {
	return strUp;
}
public void setStrUp(String strUp) {
	this.strUp = strUp;
}
public String getStrDown() {
	return strDown;
}
public void setStrDown(String strDown) {
	this.strDown = strDown;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      Main1 program=new Main1();
      String a=scan.nextLine();
      String b=scan.nextLine();
      if(a.length()<b.length()){
    	  program.setStrUp(a);
    	  program.setStrDown(b);
      }
      else {
    	  program.setStrUp(b);
    	  program.setStrDown(a);   	  
      }
      program.findDuplicate();
	}
public void findDuplicate(){
	int numUp=strUp.length();
	int numDown=strDown.length();
	for(int i=0;i<numUp+numDown;i++){
		if(i<=numDown&&i<=numUp){//从左向右滑动第一阶段
			for(int j=0;j<=i;j++){
				for(int n=0;n<=j;n++){
				String tempUp=strUp.substring(numUp-1-i, numUp-1-i+n);
				String tempDown=strDown.substring(0, n);
				if(tempUp.equals(tempDown))System.out.println(tempUp);
				else break;
				}
			}
			
		}
		if(i<=numDown&&i>=numUp){//从左向右滑动第二阶段
			for(int j=0;j<=i;j++){
				for(int n=0;n<=j;n++){
				String tempUp=strUp.substring(0, n);
				String tempDown=strDown.substring(i-(numUp-1), i-(numUp-1)+n);
				if(tempUp.equals(tempDown))System.out.println(tempUp);
				else break;
				}
			}
			
		}
		if(i>=numDown&&i>=numUp){//从左向右滑动第三阶段
			for(int j=0;j<=(numDown-(i-numUp));j++){
				for(int n=0;n<=j;n++){
				String tempUp=strUp.substring(0, n);
				String tempDown=strDown.substring(i-(numUp-1), i-(numUp-1)+n);				
				if(tempUp.equals(tempDown))System.out.println(tempUp);
				else break;
				}
			}
			
		}
		
	}
	
}
}
