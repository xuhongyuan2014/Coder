package test64;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int line = Integer.valueOf(scan.nextLine());
		String[] str = new String[line];
		for (int i = 0; i < line; i++) {
			str[i] = scan.nextLine();
		}
		Stack<Character> stack = new Stack<Character>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (result.length() > 0 && str[i].charAt(j) == '#') {
					result.deleteCharAt(result.length() - 1);
					// stack.pop();
				} else if (str[i].charAt(j) == '@') {
					// result.delete(0, result.length()-1);
					result.setLength(0);
					// stack.clear();
				} else {
					// stack.push(str[i].charAt(j));
					if (str[i].charAt(j) != '#') {
						result.append(str[i].charAt(j));
					}
				}
			}
			System.out.println(result.toString());
			// stack.clear();
			// result.delete(0, result.length()-1);
			result.setLength(0);
		}
	}

}
