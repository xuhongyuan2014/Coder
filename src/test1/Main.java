package test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator ��������Ӵ�
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
			System.out.println("�ǻ����ַ���");
		else
			System.out.println("���ǻ����ַ���");
	}

	public void printAllSubString(String str) {// ��������Ӵ�
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.subSequence(i, j));
			}
		}
	}

	public void printAllUniqueString(String str) {// ������ظ����Ӵ�
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

	public boolean ifHuiWen(String str) {// �ж��Ƿ��ǻ����ַ���
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
