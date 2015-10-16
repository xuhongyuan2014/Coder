package test86;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String[]> config = new ArrayList<String[]>();
		/*����������Ϣ*/
		String[] books = { "book" };
		String[] food = { "chocolates", "chocolate" };
		String[] medical = { "pills" };
		config.add(books);
		config.add(food);
		config.add(medical);
		
		String[] str = { "1 book at 12.49", "1 music CD at 14.99",
				"1 chocolate bar at 0.85" };//��������
		getOutput(str, config);
	}
	public static void getOutput(String[] str, ArrayList<String[]> config) {// ����������,��Input�ַ������鴫��ú�������
		float origin = 0;// ԭʼ�۸�
		float result = 0;// ���ռ۸�
		for (int i = 0; i < str.length; i++) {
			String[] arrays = str[i].split(" ");
			float priceOrigin = Float.valueOf(arrays[arrays.length - 1]);//�õ���ǰ��Ŀԭʼ�۸�
			origin = origin + priceOrigin;
			float price = getPrice(str[i], config);//���㵱ǰ��Ŀ�����ռ۸�
			result = result + price;
			for (int j = 0; j < arrays.length; j++) {//�淶�����ʽ
				if (arrays[j].equals("at")) {
					continue;
				}
				if (j == arrays.length - 1) {
					System.out.println(":" + String.format("%.2f", price));
				} else {
					System.out.print(arrays[j] + " ");
				}
			}
		}
		System.out.println("Sales Taxes:"
				+ String.format("%.2f", result - origin));
		System.out.println("Total:" + String.format("%.2f", result));
	}

	public static float getPrice(String str, ArrayList<String[]> config) {// ���������ȡrate��������ռ۸�
		int rate = 0;
		String[] arrays = str.split(" ");
		float price = Float.valueOf(arrays[arrays.length - 1]);
		if (str.contains("imported")) {
			rate = rate + 5;// ����rate 5%
		}
		boolean isBase = true;
		for (String[] temp : config) {
			for (int i = 0; i < temp.length; i++) {// ����������������Ʒ�򲻼������rate
				if (str.contains(temp[i])) {
					isBase = false;
				}
			}
		}
		if (isBase) {// ����rate 10%
			rate = rate + 10;
		}
		return price * (100 + rate) / 100;
	}

}
