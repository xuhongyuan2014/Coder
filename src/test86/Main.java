package test86;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String[]> config = new ArrayList<String[]>();
		/*基本配置信息*/
		String[] books = { "book" };
		String[] food = { "chocolates", "chocolate" };
		String[] medical = { "pills" };
		config.add(books);
		config.add(food);
		config.add(medical);
		
		String[] str = { "1 book at 12.49", "1 music CD at 14.99",
				"1 chocolate bar at 0.85" };//测试数据
		getOutput(str, config);
	}
	public static void getOutput(String[] str, ArrayList<String[]> config) {// 输出结果函数,将Input字符串数组传入该函数即可
		float origin = 0;// 原始价格
		float result = 0;// 最终价格
		for (int i = 0; i < str.length; i++) {
			String[] arrays = str[i].split(" ");
			float priceOrigin = Float.valueOf(arrays[arrays.length - 1]);//得到当前条目原始价格
			origin = origin + priceOrigin;
			float price = getPrice(str[i], config);//计算当前条目的最终价格
			result = result + price;
			for (int j = 0; j < arrays.length; j++) {//规范输出格式
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

	public static float getPrice(String str, ArrayList<String[]> config) {// 根据输入获取rate计算出最终价格
		int rate = 0;
		String[] arrays = str.split(" ");
		float price = Float.valueOf(arrays[arrays.length - 1]);
		if (str.contains("imported")) {
			rate = rate + 5;// 增加rate 5%
		}
		boolean isBase = true;
		for (String[] temp : config) {
			for (int i = 0; i < temp.length; i++) {// 如果是属于例外的物品则不计算基本rate
				if (str.contains(temp[i])) {
					isBase = false;
				}
			}
		}
		if (isBase) {// 基本rate 10%
			rate = rate + 10;
		}
		return price * (100 + rate) / 100;
	}

}
