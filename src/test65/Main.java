package test65;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
/*
3 1
2 3
5 4
1 2
3 4
2 5
3 2
0 0

0
4
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		StringBuilder result=new StringBuilder();
		String temp;
		while(scan.hasNext()){
			String [] str=scan.nextLine().split(" ");
			//System.out.println(str);
			int num=Integer.valueOf(str[0]);
			int line=Integer.valueOf(str[1]);
			//System.out.println(num+"  "+line);
			if(num==0&&line==0){
				break;
			}
			//int [][] array=new int[line][2];
			//int [] array=new int[num]; 
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			map.put(1, 0);
			//System.out.println(line);
			for(int i=0;i<line;i++){
				String [] link=scan.nextLine().split(" ");
				int peple1=Integer.valueOf(link[0]);
				int peple2=Integer.valueOf(link[1]);
				//System.out.println(peple1+"  "+peple2);
				if(map.containsKey(peple1)){
					map.put(peple2, 0);
				}
				if(map.containsKey(peple2)){
					map.put(peple1, 0);
				}
/*				if(map.containsKey(peple1)){
					map.put(peple2, 0);
				}
				if(map.containsKey(peple2)){
					map.put(peple1, 0);
				}*/
			}
			result.append(map.keySet().size()-1);
			
		}
		//System.out.println("+++");
		for(int i=0;i<result.length();i++){
			System.out.println(result.charAt(i));
		}
	}

}
