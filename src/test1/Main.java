package test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		Main program = new Main();
		program.printAllSubString(str);
		System.out.println("------");
		program.printAllUniqueString(str);
		if (program.ifHuiWen(str))
			System.out.println("是回文字符串");
		else
			System.out.println("不是回文字符串");
	}

	public void printAllSubString(String str) {// 输出所有子串
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.subSequence(i, j));
			}
		}
	}

	public void printAllUniqueString(String str) {// 输出不重复的子串
		HashMap<String, String> hashmap = new HashMap<>();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				hashmap.put(str.subSequence(i, j).toString(), "");
			}
		}
		for (Map.Entry<String, String> entry : hashmap.entrySet()) {
			// System.out.println("Key="+entry.getKey()+"---->value="+entry.getValue().toString());
			System.out.println(entry.getKey());
		}
	}

	public boolean ifHuiWen(String str) {// 判断是否是回文字符串
	/*
	 * boolean flag=true; for(int i=0;i<=(str.length()+1)/2-1;i++){
	 * if(str.charAt(i)!=str.charAt(str.length()-1-i)) flag=false; }
	 */

		int j = str.length() - 1;
		int i = 0;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}

		return true;
	}

}
