package test1;

import java.util.Scanner;

/**
 * @author Administrator 输出所有子串
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.subSequence(i, j));
			}

		}
	}

}
