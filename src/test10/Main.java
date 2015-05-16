package test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer buf = new StringBuffer();
		System.out.println(replaceSpace(buf.append(str)));
	}

	public static String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll(" ", "%20");
	}

}
