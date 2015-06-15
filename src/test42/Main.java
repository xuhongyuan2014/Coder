package test42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private String[] key = { "reset", "reset board", "board add",
			"board delet", "reboot backplane", "backplane abort" };
	private String[] output = { "reset what", "board fault", "where to add",
			"no board at all", "impossible", "install first" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Main program = new Main();
		List list = new ArrayList();
		while (scan.hasNextLine()) {
			String temp = scan.nextLine();
			if (!temp.equals("")) {
				list.add(temp);
			} else {
				break;
			}
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			program.operate(it.next());
		}

	}

	public void operate(String str) {
		String[] words = str.split(" ");
		int count = 0;
		int position = 0;
		for (int i = 0; i < key.length; i++) {// 遍历整个关键字列表
			String[] target = key[i].split(" ");
			if (target.length == words.length) {// 如果关键字和
				int flag = 0;
				for (int j = 0; j < target.length; j++) {// 遍历该关键字
					if (validString(words[j], target[j])) {
						flag++;
					}
				}
				if (flag == target.length) {
					position = i;
					count++;
				}
			}
		}
		if (count == 1) {
			System.out.println(output[position]);
		} else {
			System.out.println("unkown command");
		}
	}

	public boolean validString(String key, String target) {
		for (int i = 0; i < key.length(); i++) {
			if (key.charAt(i) != target.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
