package test14;

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
		long num = scan.nextLong();
		scan.nextLine();
		String s = "";
		for (int i = 2; i <= num;) {
			if (valid(i) && num % i == 0) {
				num = num / i;
				s = s + i + " ";
			} else {
				i++;
			}
		}
		System.out.println(s.trim());

	}

	public static boolean valid(int num) {// ����Ƿ�����
		if (num == 2) {
			// System.out.println("����"+num);
			return true;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				// System.out.println("������"+num);
				return false;
			}
		}
		// System.out.println("����"+num);
		return true;
	}
}
