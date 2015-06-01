package test32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author mrxu
 *
 *
 *4 6 0 7 3 3 5 0 9
 *
 *
 *5
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [] str=scan.nextLine().split(" ");
		int [] arr=new int[str.length];
		for(int i=0;i<str.length;i++){
			arr[i]=Integer.valueOf(str[i]);
		}
		System.out.println(getMaxABSLeftAndRight(arr));
	}
	public static int getMaxABSLeftAndRight(int[] arr) {
		int [] left=new int[arr.length];
		int [] right=new int[arr.length];
		int leftMax=arr[0];
		int rightMax=arr[arr.length-1];
		int result=0;
		for(int i=0;i<arr.length;i++){
			leftMax=leftMax>=arr[i]?leftMax:arr[i];
			left[i]=leftMax;
		}
		for(int j=arr.length-1;j>=0;j--){
			rightMax=rightMax>=arr[j]?rightMax:arr[j];
			right[j]=rightMax;
			result=result>=Math.abs(left[j]-right[j])?result:Math.abs(left[j]-right[j]);
			//System.out.println(result);
		}
		return result;
	}
  
}
