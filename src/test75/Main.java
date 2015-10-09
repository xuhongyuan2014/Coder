package test75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(evalRPN(scan.nextLine().split(" ")));
	}

	public static int evalRPN(String[] tokens) {
		String operator="+-*/";
		Stack<String> stack=new Stack<String>();
		for(String s:tokens){
			if(!operator.contains(s)){
				stack.push(s);
			}
			else {
				int a=Integer.valueOf(stack.pop());
				int b=Integer.valueOf(stack.pop());
				switch(operator.indexOf(s)){
				case 0: stack.push(String.valueOf(a+b));break;//×¢Òâ¼Óbreak
				case 1: stack.push(String.valueOf(b-a));break;
				case 2: stack.push(String.valueOf(a*b));break;
				case 3: stack.push(String.valueOf(b/a));break;
				}
			}
			//System.out.println(stack.toString());
		}
		return Integer.valueOf(stack.pop());
	}
}