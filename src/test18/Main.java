package test18;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      System.out.println(calculate(num).toString());
	}
	public static BigInteger calculate(int n){
		BigInteger result=BigInteger.valueOf(2);
		if(n>1) result=calculate(n-1).add(calculate(n-1)).add(BigInteger.valueOf(2)); 
		return result;
	}
}
