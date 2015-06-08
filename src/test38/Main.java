package test38;

import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int num=scan.nextInt();
		scan.nextLine();
		String [] array=scan.nextLine().split(" ");
		moveRight(array,num);
	}
	public static void moveRight(Object [] array,int num){
		Object [] result=new Object[array.length];
		for(int i=0;i<array.length;i++){
			result[(i+num)%array.length]=array[i];
		}
		for(int i=0;i<array.length;i++){
			if(i!=array.length-1){
				System.out.print(result[i]+" ");
			}
			else {
				System.out.print(result[i]);
			}
		}
	
	}
}
